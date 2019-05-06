package com.hqhw.other.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliyuncs.utils.StringUtils;
import com.hqhw.mapper.AdinformationMapper;
import com.hqhw.mapper.UsersMapper;
import com.hqhw.other.server.RegisterServer;
import com.hqhw.pojo.Adinformation;

@Service
public class RegisterServerImpl implements RegisterServer {

	@Autowired
	UsersMapper um;
	
	@Autowired
	AdinformationMapper afm;
	
	@Override
	public Boolean findPhone(String phone) {
//		空的才能注册
		return StringUtils.isEmpty(um.findPhone(phone));
	}

	@Override
	public Boolean findEmail(String email) {
		return StringUtils.isEmpty(um.findEmail(email));
	}

	@Override
	public void adminRegister(Adinformation af) {
		// TODO Auto-generated method stub
		afm.insertSelective(af);
	}

}
