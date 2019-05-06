package com.hqhw.other.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/local")
public class LocaleSetController {
	
//	添加省
	@RequestMapping(value="/provinceLocalAdd")
	public void provinceLocalAdd() {
		
	}
}
