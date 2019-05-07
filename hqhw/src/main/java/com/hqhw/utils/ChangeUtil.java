package com.hqhw.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Component
public class ChangeUtil<T> {

//	对象转json对象格式字符串
	public JSONObject objectToJson(T t) {
		JSONObject json = JSONObject.fromObject(t);
		return json;
	}
	
//	对象转json数组格式字符串
	public JSONArray objectToJsonarray(T t) {
		JSONArray json=JSONArray.fromObject(t);
		return json;
	}
	
//	map转json对象格式字符串
	
	
	public JSONObject mapToJson(Map map) {
		JSONObject json = JSONObject.fromObject(map);
		return json;
	}
}
