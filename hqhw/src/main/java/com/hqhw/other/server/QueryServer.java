package com.hqhw.other.server;

import java.util.List;
import java.util.Map;

import com.hqhw.pojo.News;

public interface QueryServer {

//	查询人员
	public Map quertPersion(String name);
	
//	查询文章
	public List<News> quertNews(String word);
}
