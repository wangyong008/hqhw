package com.hqhw.h.zixun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.JsonObject;
import com.hqhw.h.zixun.server.impl.NewSortServerImpl;
import com.hqhw.pojo.Newsort;

@Controller
@RequestMapping(value = "/newsort")
public class NewSortController {

	@Autowired
	NewSortServerImpl nssi;
	
//	添加
	@RequestMapping(value = "add")
	public void newSortAdd(@RequestBody Newsort newSort) {
		nssi.newSortAdd(newSort);
	}
	
//	删除
	@RequestMapping(value = "delete")
	public void newSortDelete(@RequestBody int id) {
		nssi.newSortDelete(id);
	}
	
//	根据id修改
	@RequestMapping(value = "update")
	public void newSortUpdate(@RequestBody Newsort newSort) {
		nssi.newSortUpdate(newSort);
	}
	
//	查找所有
	@RequestMapping(value = "findall")
	public JsonObject newSortFindAll() {
		nssi.newSortFindAll();
		return null;
	}
}
