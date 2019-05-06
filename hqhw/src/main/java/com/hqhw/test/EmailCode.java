package com.hqhw.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dm.model.v20151123.SingleSendMailRequest;
import com.aliyuncs.dm.model.v20151123.SingleSendMailResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.google.gson.Gson;
import com.hqhw.utils.NomalUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class EmailCode {

	@Autowired
	NomalUtils nu;
	
	/**
	 * 阿里云邮箱验证码功能-测试通过
	 * 参考地址https://www.cnblogs.com/ruko/articles/5917118.html
	 */
	@Test
	public void email() {
		//调试地址https://api.aliyun.com/?spm=5176.11122631.962077.3.5d5b3801au3rNN#/
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAILLt0bwmyX4G8", "hZhB4YGGLJxpZU2lNzPWeRwLvelnf0");
        IAcsClient client = new DefaultAcsClient(profile);

        SingleSendMailRequest request = new SingleSendMailRequest();
//        邮件正文
        request.setTextBody("您的验证码为" + nu.getRandom(4));
//        发信人昵称
        request.setFromAlias("客服");
//        邮件主题
        request.setSubject("环球户外在线");
//        标签
        request.setTagName("注册验证码");
//        发信人地址
        request.setToAddress("1151360186@qq.com");
//        是否使用管理控制台中配置的回信地址
        request.setReplyToAddress(false);
//        取值范围 0~1: 0 为随机账号；1 为发信地址。
        request.setAddressType(1);
//        管理控制台中配置的发信地址。
        request.setAccountName("service@email.hqhwzx.com");

        try {
            SingleSendMailResponse response = client.getAcsResponse(request);
            System.out.println(new Gson().toJson(response));
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            System.out.println("ErrCode:" + e.getErrCode());
            System.out.println("ErrMsg:" + e.getErrMsg());
            System.out.println("RequestId:" + e.getRequestId());
        }
    }
}
