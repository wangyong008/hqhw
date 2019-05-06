package com.hqhw.other.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hqhw.other.server.impl.CheckServerImpl;

@Controller
@RequestMapping(value = "/check")
public class CheckController {

	@Autowired
	CheckServerImpl cs;
	
//	 电话验证码验证
	@RequestMapping(value = "/phoneCheck")
	public String phoneCheck(@RequestBody String phone) {
		String code = cs.phoneCheck(phone);
		return code;
	}
	
	/**
	 * 邮箱验证码验证
	 * @return
	 */
	@RequestMapping(value = "/emailCheck")
	public String emailCheck(@RequestBody String email) {
		String code = cs.emailCheck(email);
		return code;
		
	}
}
