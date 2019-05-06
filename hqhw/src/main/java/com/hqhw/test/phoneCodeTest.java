package com.hqhw.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.hqhw.utils.NomalUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class phoneCodeTest {

	/**
	 * 阿里云短信验证码demo--通过
	 */
	@Autowired
	NomalUtils nu;
	
	 @Test 
	 public void phoneDemo() {
	 /**
		 * 参数1：RegionId--默认"defalt" 参数2： AccessKey ID--阿里云上查找 参数3：:Access Key
		 * Secret--阿里云上查找
		 */
			  DefaultProfile profile = DefaultProfile.getProfile("defalt",
			  "LTAILLt0bwmyX4G8", "hZhB4YGGLJxpZU2lNzPWeRwLvelnf0"); IAcsClient client =
			  new DefaultAcsClient(profile);
			  
			  //验证码 
			  String code = nu.getRandom(4); 
			  String name = "老王";
			  String password = "13120";
			  CommonRequest request = new CommonRequest();
			  //request.setProtocol(ProtocolType.HTTPS);
			  request.setMethod(MethodType.POST); //开发者不用改
			  request.setDomain("dysmsapi.aliyuncs.com"); request.setVersion("2017-05-25");
			  request.setAction("SendSms");
			  
			  //电话 
			  request.putQueryParameter("PhoneNumbers", "17585561509");
			  
			  //申请的签名 
			  request.putQueryParameter("SignName", "环球户外在线");
			  
			  //申请的模板code
			  request.putQueryParameter("TemplateCode", "SMS_164266089");
			  
			  //验证码，必须以{"code":"8888"}json格式字符串发送过去	"TemplateParam", "{\"name\":\""+name+"\"}"
			  request.putQueryParameter("TemplateParam", "{\"name\":\""+name+"\",\"password\":\""+password+"\"}"); try {
			  CommonResponse response = client.getCommonResponse(request);
			  
			  //回执信息 
			  System.out.println(response.getData()); 
			  } catch (ServerException e) {
			  e.printStackTrace(); 
			  } catch (ClientException e) { 
				  e.printStackTrace(); 
				  } 
			  }
}
