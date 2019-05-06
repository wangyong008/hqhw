package com.hqhw.other.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hqhw.other.server.impl.SystemInformationServerImpl;
import com.hqhw.pojo.Integralgrade;
import com.hqhw.pojo.Integralrule;
import com.hqhw.pojo.Webinformation;

@Controller
@RequestMapping(value = "/system")
public class SystemInformationController {
	
	@Autowired
	SystemInformationServerImpl sisi;
	
//	网站信息表、积分等级表、积分规则表更新
	@RequestMapping(value = "/change")
	public void informationChange(@RequestBody Webinformation webinformation, Integralrule integralrule, Integralgrade integralgrade) {
		sisi.informationChange(webinformation, integralrule, integralgrade);
	}
}
