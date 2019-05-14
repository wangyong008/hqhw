package com.hqhw.other.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aliyuncs.utils.StringUtils;
import com.hqhw.mapper.AdinformationMapper;
import com.hqhw.mapper.UsersMapper;
import com.hqhw.other.server.impl.LoginServerImpl;
import com.hqhw.other.server.impl.RegisterServerImpl;
import com.hqhw.pojo.Adinformation;
import com.hqhw.pojo.Users;
import com.hqhw.utils.GetName;
import com.hqhw.utils.NomalUtils;
import com.hqhw.utils.SendCode;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

	@Autowired
	RegisterServerImpl rsi;
	
	@Autowired
	GetName gn;
	
	@Autowired
	NomalUtils nu;
	
	@Autowired
	UsersMapper um;
	
	@Autowired
	LoginServerImpl ls;
	
	@Autowired
	SendCode sc;
	
	@Autowired
	AdinformationMapper afm;
	
	/**
	 * 电话注册
	 * @return
	 */
	@RequestMapping(value = "/phone")
	public String phoneRegister(String phone, String name, String password, HttpSession session) {
		Users u = new Users();
		String loginMessige = null;
		String account = null;
		Boolean dis = false;
		
		if(rsi.findPhone(phone) == true) {
//			生成相关数据并保存
			while(dis) {
				account = nu.getRandom(8);
				if(um.hasAccount(account).isEmpty()) {
					dis = true;
				}
			}
			
			String passwordSalt = nu.md5(password);
			u.setName(name);
			u.setPhone(phone);
			u.setPasswordSalt(passwordSalt);
			u.setPassword(password);
			um.insertSelective(u);
			
//			执行登录
			loginMessige = ls.Login(name, password);
			if(loginMessige.equals("登录成功")) {
				session.setAttribute("name", name);
				return loginMessige;
			}
		}
		return "该手机号已被注册";
		
	}
	
	/**
	 * 邮箱注册
	 * @return
	 */
	@RequestMapping(value = "/email")
	public String emailRegister(String email, String name, String password, HttpSession session) {
		Users u = new Users();
		String loginMessige = null;
		String account = null;
		Boolean dis = false;
		
		if(rsi.findEmail(email) == true) {
//			生成相关数据并保存
			while(dis) {
				account = nu.getRandom(8);
				if(um.hasAccount(account).isEmpty()) {
					dis = true;
				}
			}
			
			String passwordSalt = nu.md5(password);
			u.setName(name);
			u.setEmail(email);
			u.setPasswordSalt(passwordSalt);
			u.setPassword(password);
			um.insertSelective(u);
			
//			执行登录
			loginMessige = ls.Login(name, password);
			if(loginMessige.equals("登录成功")) {
				session.setAttribute("name", name);
				return loginMessige;
			}
		}
		return "该邮箱已被注册";
		
	}
	
	/**
	 * 判断用户名是否存在
	 * 1：存在	0：不存在
	 * @return
	 */
	@RequestMapping(value = "/checkname")
	public String checkName(String name) {
		if(StringUtils.isNotEmpty(um.findName(name))) {
			return "1";
		}
		return "0";
		
	}
	
//	管理员注册
	@RequestMapping(value = "/admin")
	public String adminRegister(Adinformation af, HttpSession session) {
		if(StringUtils.isNotEmpty(afm.findAccount(af.getAccount()))) {
			return "该账号已存在";
		}
		af.setPasswordSalt(nu.md5(af.getPassword()));
		rsi.adminRegister(af);
		return "";
		
	}
}
