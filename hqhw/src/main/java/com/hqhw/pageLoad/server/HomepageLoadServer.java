package com.hqhw.pageLoad.server;

import net.sf.json.JSONObject;

public interface HomepageLoadServer {

//	首页加载第一部分
	public JSONObject homepageLoadOne();
	
//	首页加载第二部分
	public JSONObject homepageLoadTwo();
	
//	首页加载第三部分
	public JSONObject homepageLoadThree();
}
