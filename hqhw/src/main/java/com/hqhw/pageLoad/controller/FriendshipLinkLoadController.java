package com.hqhw.pageLoad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hqhw.pageLoad.server.Impl.FriendshipLinkLoadServerImpl;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value = "/load")
public class FriendshipLinkLoadController {

	@Autowired
	FriendshipLinkLoadServerImpl fllsi;
	
	@RequestMapping(value = "/friendship")
	@ResponseBody
	public JSONObject friendshipLinkLoad() {
		
		JSONObject friendship = new JSONObject();
		friendship = fllsi.friendshipLinkLoad();
		
		return friendship;
		
	}
}
