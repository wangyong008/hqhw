package com.hqhw.other.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dm.model.v20151123.SingleSendMailRequest;
import com.aliyuncs.dm.model.v20151123.SingleSendMailResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.google.gson.Gson;
import com.hqhw.other.server.CheckServer;
import com.hqhw.utils.NomalUtils;
import com.hqhw.utils.SendCode;

/**
 * 发送验证码
 * 
 * @author admin
 *
 */
@Service
public class CheckServerImpl implements CheckServer {
	
	private static final String AccessKeyID = "LTAILLt0bwmyX4G8";
	private static final String AccessKey = "hZhB4YGGLJxpZU2lNzPWeRwLvelnf0";

	@Autowired
	NomalUtils nUtils;
	
	@Autowired 
	SendCode sc;
	
	public String emailCheck(String email) {
		String code = nUtils.getRandom(4);
		String comment ="您的验证码为" + code;
		sc.emailCode(email, comment);
		return code;
	}

	public String phoneCheck(String phone) {
		String code = nUtils.getRandom(4);
		String TemplateCode = "SMS_163960080";
		String comtent = "{\"code\":\""+code+"\"}";
		
		sc.phoneCode(TemplateCode, phone, comtent);
		return code;

	}
}
