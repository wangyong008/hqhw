package com.hqhw.pageLoad.server.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqhw.bean.AdvertisementFiles;
import com.hqhw.dao.AdvertisementFilesMapper;
import com.hqhw.mapper.NewsMapper;
import com.hqhw.pageLoad.server.HomepageLoadServer;
import com.hqhw.pojo.News;

@Service
public class HomepageLoadServerImpl implements HomepageLoadServer {

	@Autowired
	AdvertisementFilesMapper afm;
	
	@Autowired
	NewsMapper nm;
	
	public void homepageLoad() {
		

		List<AdvertisementFiles> advertisementInAOne = new ArrayList<AdvertisementFiles>();
		List<AdvertisementFiles> advertisementInATwo = new ArrayList<AdvertisementFiles>();
		News n = new News();
		
//		a1,a2处广告的path，id，addre
		advertisementInAOne = afm.findAdvertisementInAOne();
		advertisementInATwo = afm.findAdvertisementInATwo();
		
//		查找头条新闻
		n = nm.findTopNews();
		
//		查找推荐视频
		
		
	}

}
