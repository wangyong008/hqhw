package com.hqhw.shiro.realms;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.hqhw.mapper.AdinformationMapper;
import com.hqhw.mapper.UsersMapper;

public class adminRealm extends AuthorizingRealm {
	
	@Autowired
	UsersMapper um;
	
	@Autowired
	AdinformationMapper afm;
	
//  授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		//1. 从 PrincipalCollection 中来获取登录用户的信息
				Object principal = principals.getPrimaryPrincipal();
				
				//2. 利用登录的用户的信息来用户当前用户的角色或权限(可能需要查询数据库)
				Set<String> roles = new HashSet<>();
				roles.add("user");
				if("admin".equals(principal)){
					roles.add("admin");
				}
				
				//3. 创建 SimpleAuthorizationInfo, 并设置其 reles 属性.
				SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roles);
				
				//4. 返回 SimpleAuthorizationInfo 对象. 
				return info;
	}

//	登录
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		
		//1. 把 AuthenticationToken 转换为 UsernamePasswordToken 
		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		
		//2. 从 UsernamePasswordToken 中来获取 username
		String account = upToken.getUsername();
		
		//3. 调用数据库的方法, 从数据库中查询 username 对应的用户记录
		String passwordSalt = afm.findPasswordSalt(account);
		
		//4. 若用户不存在, 则可以抛出 UnknownAccountException 异常
		if("unknown".equals(account)){
			throw new UnknownAccountException("用户不存在!");
		}
		
		//6. 根据用户的情况, 来构建 AuthenticationInfo 对象并返回. 通常使用的实现类为: SimpleAuthenticationInfo
		//以下信息是从数据库中获取的.
		//1). principal: 认证的实体信息. 可以是 username, 也可以是数据表对应的用户的实体类对象. 
		Object principal = account;
		//2). credentials: 密码. 
		Object credentials = passwordSalt;
		
		//3). realmName: 当前 realm 对象的 name. 调用父类的 getName() 方法即可
		String realmName = getName();
		//4). 盐值. 
		ByteSource credentialsSalt = ByteSource.Util.bytes("hqhw");
		
		SimpleAuthenticationInfo info = null; 
		info = new SimpleAuthenticationInfo(principal, credentials, credentialsSalt, realmName);
		return info;
	}
	
}
