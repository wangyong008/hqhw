package com.hqhw.utils;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class TimeUtil {
	
	
	/**
	 * 根据用户传入的时间表示格式，返回当前时间的格式 如果是yyyyMMdd，注意字母y不能大写。
	 *
	 * @param sformat yyyyMMddhhmmss
	 * @return
	 */
	public static String getUserDate(String sformat) {
	    Date currentTime = new Date();
	    SimpleDateFormat formatter = new SimpleDateFormat(sformat);
	    String dateString = formatter.format(currentTime);
	    return dateString;
	}
}
