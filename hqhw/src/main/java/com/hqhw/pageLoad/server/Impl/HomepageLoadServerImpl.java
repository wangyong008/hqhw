package com.hqhw.pageLoad.server.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqhw.bean.AdvertisementFiles;
import com.hqhw.bean.FilesNews;
import com.hqhw.bean.FilesVideomanager;
import com.hqhw.dao.AdvertisementFilesMapper;
import com.hqhw.dao.FilesNewsMapper;
import com.hqhw.dao.FilesVideomanagerMapper;
import com.hqhw.mapper.NewsMapper;
import com.hqhw.mapper.SpecialMapper;
import com.hqhw.pageLoad.server.HomepageLoadServer;
import com.hqhw.pojo.News;
import com.hqhw.pojo.Special;
import com.hqhw.utils.ChangeUtil;

import net.sf.json.JSONObject;

@Service
public class HomepageLoadServerImpl implements HomepageLoadServer {

	@Autowired
	AdvertisementFilesMapper afm;
	
	@Autowired
	NewsMapper nm;
	
	@Autowired
	FilesVideomanagerMapper fvm;
	
	@Autowired
	SpecialMapper sm;
	
	@Autowired
	FilesNewsMapper fnm;
	
	@Autowired
	ChangeUtil cu;
	
	public JSONObject homepageLoadOne() {

		List<AdvertisementFiles> advertisementInAOne = new ArrayList<AdvertisementFiles>();
		List<AdvertisementFiles> advertisementInATwo = new ArrayList<AdvertisementFiles>();
		List<FilesVideomanager> videoList = new ArrayList<FilesVideomanager>();
		List<Special> specialTen = new ArrayList<Special>();
		List<News> nHWZXNewsTen = new ArrayList<News>();
		List<News> nQCZXNewsTen = new ArrayList<News>();
		List<News> nHWSQNewsTen = new ArrayList<News>();
		List<News> nSJZXNewsTen = new ArrayList<News>();
		Map<String, Object> map = new HashMap<String, Object>();
		FilesNews endSJZXNews = new FilesNews();
		News nHWZXRecommendNews = new News();
		News nTopNews = new News();
		FilesVideomanager fv = new FilesVideomanager();
		
//		a1,a2处广告的path，id，addre
		advertisementInAOne = afm.findAdvertisementInAOne();
		advertisementInATwo = afm.findAdvertisementInATwo();
		
//		查找头条新闻id,title
		nTopNews = nm.findTopNews();
		
//		查找推荐视频id,title
		fv = fvm.findTopVideo();
		
//		查找十篇视频id,title
		videoList = fvm.findVideoTen();
		
//		查找推荐的户外资讯类型资讯id,title
		nHWZXRecommendNews = nm.findHWZXRecommendNews();
		
//		查找十篇户外资讯类型资讯id,title
		nHWZXNewsTen = nm.findHWZXNewsTen();
		
//		查找十篇汽车资讯类型资讯id,title
		nQCZXNewsTen = nm.findQCZXNewsTen();
		
//		查找十篇户外社区类型资讯id,title
		nHWSQNewsTen = nm.findHWSQNewsTen();
		
//		查找十篇社交资讯类型资讯id,title
		nSJZXNewsTen = nm.findSJZXNewsTen();
		
//		查找最新一篇社交资讯类型资讯的id，path，title
		endSJZXNews = fnm.findEndSJZXNews();
		
//		查找十篇专题id,title
		specialTen = sm.findSpecialTen();
		
		map.put("advertisementInAOne", advertisementInAOne);
		map.put("advertisementInATwo", advertisementInATwo);
		map.put("nTopNews", nTopNews);
		map.put("fv", fv);
		map.put("videoList", videoList);
		map.put("nHWZXRecommendNews", nHWZXRecommendNews);
		map.put("nHWZXNewsTen", nHWZXNewsTen);
		map.put("nQCZXNewsTen", nQCZXNewsTen);
		map.put("nHWSQNewsTen", nHWSQNewsTen);
		map.put("nSJZXNewsTen", nSJZXNewsTen);
		map.put("endSJZXNews", endSJZXNews);
		map.put("specialTen", specialTen);
		
		return cu.mapToJson(map);
	}

	public JSONObject homepageLoadTwo() {
		return null;
		
	}

	public JSONObject homepageLoadThree() {
		return null;
	}

}
