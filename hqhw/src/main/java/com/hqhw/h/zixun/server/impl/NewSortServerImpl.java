package com.hqhw.h.zixun.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqhw.h.zixun.server.NewSortServer;
import com.hqhw.mapper.NewsortMapper;
import com.hqhw.pojo.Newsort;

@Service
public class NewSortServerImpl implements NewSortServer {

	@Autowired
	NewsortMapper nsm;
	
	public void newSortAdd(Newsort newSort) {
		nsm.insertSelective(newSort);
	}

	public void newSortUpdate(Newsort newSort) {
		nsm.updateByPrimaryKeySelective(newSort);
	}

	public void newSortDelete(Integer id) {
		nsm.deleteByPrimaryKey(id);
	}

	public List<Newsort> newSortFindAll() {
		return nsm.findAll();
	}

}
