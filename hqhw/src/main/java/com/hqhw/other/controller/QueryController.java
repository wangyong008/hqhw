package com.hqhw.other.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.JsonObject;
import com.hqhw.other.server.impl.QueryServerImpl;
import com.hqhw.utils.ChangeUtil;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value = "/query")
public class QueryController {

	@Autowired
	QueryServerImpl qsi;
	
//	查询人员
	@RequestMapping(value = "/presion")
	public ModelAndView quertPersion(@RequestBody String name) {
		ModelAndView mav = new ModelAndView();
		mav.addObject(JSONObject.fromObject(qsi.quertPersion(name)));
		mav.setViewName("");
		return mav;
	}
	
//	查询文章
	@RequestMapping(value = "/news")
	public ModelAndView quertNews(@RequestBody String word) {
		ModelAndView mav = new ModelAndView();
		mav.addObject(JSONObject.fromObject(qsi.quertNews(word)));
		mav.setViewName("");
		return mav;
	}
}
