package com.hqhw.other.server.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hqhw.bean.CorrespondentFiles;
import com.hqhw.dao.CorrespondentFilesMapper;
import com.hqhw.mapper.AdinformationMapper;
import com.hqhw.other.server.QueryServer;
import com.hqhw.pojo.Adinformation;

public class QueryServerImpl implements QueryServer{

	@Autowired
	CorrespondentFilesMapper cfm;
	
	@Autowired
	AdinformationMapper am;
	
	public String quertPersion(String name) {
		List<Adinformation> af = new ArrayList<Adinformation>();
		List<CorrespondentFiles> cf = new ArrayList<CorrespondentFiles>();
		
//		查找通讯员tname,sex, phone, path, phone, area, email
		cf = cfm.findByName(name);
		
//		查找管理员name, department, sex, dutie, education, phone, workarea, path
//		id, name, sex, education, phone, workarea查找
		af = am.findByName(name);
		return null;
	}

	public String quertNews(String word) {
		return null;
	}

}
