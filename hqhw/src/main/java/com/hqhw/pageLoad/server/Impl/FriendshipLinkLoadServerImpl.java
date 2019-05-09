package com.hqhw.pageLoad.server.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqhw.mapper.FriendshiplinkMapper;
import com.hqhw.pageLoad.server.FriendshipLinkLoadServer;
import com.hqhw.pojo.Friendshiplink;
import com.hqhw.utils.ChangeUtil;

import net.sf.json.JSONObject;
@Service
public class FriendshipLinkLoadServerImpl implements FriendshipLinkLoadServer {

	@Autowired
	FriendshiplinkMapper fm;
	
	@Autowired
	ChangeUtil cu;
	
	public JSONObject friendshipLinkLoad() {
		
		List<Friendshiplink> allFriendshiplink = new ArrayList<Friendshiplink>();
		allFriendshiplink = fm.findAll();
		return cu.objectToJson(allFriendshiplink);
	}

}
