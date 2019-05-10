package com.hqhw.other.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/query")
public class QueryController {

//	查询人员
	@RequestMapping(value = "/presion")
	public String quertPersion(@RequestBody String name) {
		return name;
		
	}
	
//	查询文章
	@RequestMapping(value = "/news")
	public String quertNews(@RequestBody String word) {
		
		return word;
	}
}
