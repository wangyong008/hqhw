package com.hqhw.other.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value = "/Test")
public class Test {

//	@RequestMapping(value = "/a")
//	@ResponseBody
//	public JSONObject test(@RequestBody String ad, HttpSession session) {
//		JSONObject json = new JSONObject();
//		json.put("code", 0);
//		return json;
//	}
	@RequestMapping(value = "/a")
	public String test(HttpSession session) {
		System.out.println(1);
		return "list";
	}
}
