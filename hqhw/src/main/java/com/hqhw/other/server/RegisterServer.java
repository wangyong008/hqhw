package com.hqhw.other.server;

import com.hqhw.pojo.Adinformation;

public interface RegisterServer {

	public Boolean findPhone(String phone);
	
	public Boolean findEmail(String email);
	
	public void adminRegister(Adinformation af);
}
