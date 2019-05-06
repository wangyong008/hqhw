package com.hqhw.other.server;

import com.hqhw.pojo.Integralgrade;
import com.hqhw.pojo.Integralrule;
import com.hqhw.pojo.Webinformation;

public interface SystemInformationServer {

	public void informationChange(Webinformation webinformation, Integralrule integralrule, Integralgrade integralgrade);
}
