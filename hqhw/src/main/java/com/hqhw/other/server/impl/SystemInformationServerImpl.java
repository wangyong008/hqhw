package com.hqhw.other.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqhw.mapper.IntegralgradeMapper;
import com.hqhw.mapper.IntegralruleMapper;
import com.hqhw.mapper.WebinformationMapper;
import com.hqhw.other.server.SystemInformationServer;
import com.hqhw.pojo.Integralgrade;
import com.hqhw.pojo.Integralrule;
import com.hqhw.pojo.Webinformation;

@Service
public class SystemInformationServerImpl implements SystemInformationServer {

	@Autowired
	WebinformationMapper wm;
	
	@Autowired
	IntegralruleMapper im;
	
	@Autowired
	IntegralgradeMapper ilm;
	
	@Override
	public void informationChange(Webinformation webinformation, Integralrule integralrule,
			Integralgrade integralgrade) {
		wm.updateByPrimaryKeySelective(webinformation);
		im.insertSelective(integralrule);
		ilm.insertSelective(integralgrade);
	}

}
