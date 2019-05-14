package com.hqhw.utils;

import java.util.List;
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
		return JSONArray.fromObject(t);
	}
	
//	map转json对象格式字符串
	public JSONObject mapToJson(Map map) {
		return JSONObject.fromObject(map);
	}
	
//	list转json
	public JSONObject listToJson(List list) {
		return JSONObject.fromObject(list);
	}
}
