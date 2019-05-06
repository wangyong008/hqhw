package com.hqhw.other.server;

public interface CheckServer {

//	 邮箱验证码
	public String emailCheck(String email);
	
//	手机验证码
	public String phoneCheck(String phone);
}
