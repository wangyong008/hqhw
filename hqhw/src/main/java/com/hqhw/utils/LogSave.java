package com.hqhw.utils;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hqhw.mapper.LogMapper;
import com.hqhw.pojo.Log;

@Component
public class LogSave {

	@Autowired
	LogMapper logM;
	
	/**
	 * 存入错误信息到日志表
	 * @param className
	 * @param time
	 * @param errorMessige
	 */
	public void save(String className, Date time, String errorMessige) {
		logM.insertSelective(new Log(className, errorMessige, time));
	}
}
