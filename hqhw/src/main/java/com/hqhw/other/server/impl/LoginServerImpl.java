package com.hqhw.other.server.impl;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

import com.hqhw.other.server.LoginServer;
@Service
public class LoginServerImpl implements LoginServer {

	private static Logger log = Logger.getLogger(LoginServerImpl.class);
	
	@Override
	public String Login(String name, String password) {
		
		Subject currentUser = SecurityUtils.getSubject();
		if (!currentUser.isAuthenticated()) {
        	// 把用户名和密码封装为 UsernamePasswordToken 对象
            UsernamePasswordToken token = new UsernamePasswordToken(name, password);
            // rememberme
            token.setRememberMe(true);
            try {
            	// 执行登录. 
                currentUser.login(token);
            } 
            // ... catch more exceptions here (maybe custom ones specific to your application?
            // 所有认证时异常的父类. 
            catch (AuthenticationException ae) {
            	log.info("LoginServerImpl" + ae.getMessage());
            	return "用户名/密码错误";
            }
        }
		return "登录成功";
	}

}
