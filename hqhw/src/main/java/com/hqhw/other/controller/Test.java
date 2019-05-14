package com.hqhw.other.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hqhw.mapper.NewsMapper;
import com.hqhw.pojo.News;
import com.hqhw.utils.ChangeUtil;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value = "/test")
public class Test {

	@Autowired
	NewsMapper nm;
	
	@Autowired
	ChangeUtil cu;
	@RequestMapping(value = "/a")
	@ResponseBody
	public JSONObject test() {
		List<News> nHWZXNewsTen = new ArrayList<News>();
		nHWZXNewsTen = nm.findHWZXNewsTen();
		Map<String, Object> map= new HashMap<String, Object>();
		map.put("nHWZXNewsTen", nHWZXNewsTen);
		return cu.mapToJson(map);
	}
}
