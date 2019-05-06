package com.hqhw.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dm.model.v20151123.SingleSendMailRequest;
import com.aliyuncs.dm.model.v20151123.SingleSendMailResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.google.gson.Gson;

@Component
public class SendCode {

	private static final String AccessKeyID = "LTAILLt0bwmyX4G8";
	private static final String AccessKey = "hZhB4YGGLJxpZU2lNzPWeRwLvelnf0";
	
	@Autowired
	NomalUtils nUtils;
	
	public void phoneCode(String TemplateCode, String phone, String comment) {
		
		DefaultProfile profile = DefaultProfile.getProfile("defalt", AccessKeyID, AccessKey);
		IAcsClient client = new DefaultAcsClient(profile);

		CommonRequest request = new CommonRequest();
		request.setMethod(MethodType.POST); // 开发者不用改
		request.setDomain("dysmsapi.aliyuncs.com");
		request.setVersion("2017-05-25");
		request.setAction("SendSms");

		// 电话
		request.putQueryParameter("PhoneNumbers", phone);

		// 申请的签名
		request.putQueryParameter("SignName", "环球户外在线");

		// 申请的模板code
		request.putQueryParameter("TemplateCode", TemplateCode);

		// 验证码，必须以{"code":"8888"}json格式字符串发送过去
		request.putQueryParameter("TemplateParam", comment);
		try {
			CommonResponse response = client.getCommonResponse(request);

			// 回执信息
//			System.out.println(response.getData());
		} catch (ServerException e) {
			e.printStackTrace();
//			ls.save("checkserver.phoneCheck", new Date(), e.toString());
		} catch (ClientException e) {
			e.printStackTrace();
//			ls.save("checkserver.phoneCheck", new Date(), e.toString());
		}
	}
	
	public void emailCode(String email, String comment) {
		//调试地址https://api.aliyun.com/?spm=5176.11122631.962077.3.5d5b3801au3rNN#/
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAILLt0bwmyX4G8", "hZhB4YGGLJxpZU2lNzPWeRwLvelnf0");
        IAcsClient client = new DefaultAcsClient(profile);

        SingleSendMailRequest request = new SingleSendMailRequest();
//        邮件正文
        request.setTextBody(comment); 
//        发信人昵称
        request.setFromAlias("客服");
//        邮件主题
        request.setSubject("环球户外在线");
//        标签
        request.setTagName("注册验证码");
//        发信人地址
        request.setToAddress(email);
//        是否使用管理控制台中配置的回信地址
        request.setReplyToAddress(false);
//        取值范围 0~1: 0 为随机账号；1 为发信地址。
        request.setAddressType(1);
//        管理控制台中配置的发信地址。
        request.setAccountName("service@email.hqhwzx.com");

        try {
            SingleSendMailResponse response = client.getAcsResponse(request);
//            System.out.println(new Gson().toJson(response));
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
//            System.out.println("ErrCode:" + e.getErrCode());
//            System.out.println("ErrMsg:" + e.getErrMsg());
//            System.out.println("RequestId:" + e.getRequestId());
        }
	}
}
