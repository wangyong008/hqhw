package com.hqhw.other.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aliyuncs.utils.StringUtils;
import com.hqhw.mapper.AdinformationMapper;
import com.hqhw.mapper.UsersMapper;
import com.hqhw.other.server.impl.LoginServerImpl;
import com.hqhw.pojo.Users;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

	@Autowired
	UsersMapper um;
	
	@Autowired
	LoginServerImpl ls;
	
	@Autowired
	AdinformationMapper afm;
	
//	电话验证码登录
	@RequestMapping(value = "/phone")
	public String phoneLogin(@RequestBody String phone, HttpSession session) {
		Users u = um.findNaPaByPh(phone);
		String name = null;
		try {
			name = u.getName();
		} catch (Exception e) {
			return "账户不存在";
		}
		String password = u.getPassword();
		
		String loginMessige = ls.Login(name, password);
		if(loginMessige.equals("登录成功")) {
			session.setAttribute("name", name);
			return "";
		}
		return null;
		
	}
	
//	邮箱登录
	@RequestMapping(value = "/email")
	public String emailLogin(@RequestBody String email, HttpSession session) {
		Users u = um.findNaPaByEa(email);
		String name = null;
		try {
			name = u.getName();
		} catch (Exception e) {
			return "账户不存在";
		}
		String password = u.getPassword();
		
		String loginMessige = ls.Login(name, password);
		if(loginMessige.equals("登录成功")) {
			session.setAttribute("name", name);
			return "";
		}
		return null;
		
	}
	
//	用户名密码登录
	@RequestMapping(value = "/name")
	public String nameLogin(String name, String password, HttpSession session) {
		if(StringUtils.isEmpty(um.findName(name))) {
			return "账户名或密码错误";
		}
		String loginMessige = ls.Login(name, password);
		if(loginMessige.equals("登录成功")) {
			session.setAttribute("name", name);
			return "";
		}
		return null;
		
	}
	
//	管理员登录
	@RequestMapping(value = "/admin")
	public String adminLogin(String account, String password, HttpSession session) {
		if(StringUtils.isEmpty(afm.findAccount(account))) {
			session.setAttribute("account", account);
			return "账户或密码错误";
		}
		
		String loginMessige = ls.Login(account, password);
		if(loginMessige.equals("登录成功")) {
			return "";
		}
		return null;
		
	}
}
