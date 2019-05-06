package com.hqhw.h.zixun.server;

import java.util.List;

import com.hqhw.pojo.Newsort;

public interface NewSortServer {

//	添加新闻分类
	public void newSortAdd(Newsort newSort);
	
//	修改新闻分类
	public void newSortUpdate(Newsort newSort);
	
//	根据id删除分类
	public void newSortDelete(Integer id);
	
//	查找所有分类
	public List<Newsort> newSortFindAll();
}
