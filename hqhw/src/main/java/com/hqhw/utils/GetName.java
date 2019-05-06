package com.hqhw.utils;

import java.io.UnsupportedEncodingException;
import java.util.Random;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hqhw.mapper.UsersMapper;
@Component
public class GetName {
	
	@Autowired
	UsersMapper um;
	
	private static final int len = 6;
	//自动生成名字（中文）
    public String getRandomName() {
        while(true) {
        	String ret = "";
        	for (int i = 0; i < len; i++) {
                String str = null;
                int hightPos, lowPos; // 定义高低位
                Random random = new Random();
                hightPos = (176 + Math.abs(random.nextInt(39))); // 获取高位值
                lowPos = (161 + Math.abs(random.nextInt(93))); // 获取低位值
                byte[] b = new byte[2];
                b[0] = (new Integer(hightPos).byteValue());
                b[1] = (new Integer(lowPos).byteValue());
                try {
                    str = new String(b, "GBK"); // 转成中文
                } catch (UnsupportedEncodingException ex) {
                    ex.printStackTrace();
                }
                ret += str;
            }
        	if(StringUtils.isBlank(um.findName(ret))) {
        		return ret;
        	}
        }
    }
}
