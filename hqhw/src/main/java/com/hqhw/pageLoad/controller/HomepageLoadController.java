package com.hqhw.pageLoad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/load")
public class HomepageLoadController {

	@RequestMapping(value = "/homepage")
	public ModelAndView homepageLoad() {
		
		return null;
		
	}

}
