package com.hqhw.pageLoad.server.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqhw.bean.ActivityFiles;
import com.hqhw.bean.AdvertisementFiles;
import com.hqhw.bean.FilesNews;
import com.hqhw.bean.FilesPicture;
import com.hqhw.bean.FilesVideomanager;
import com.hqhw.dao.ActivityFilesMapper;
import com.hqhw.dao.AdvertisementFilesMapper;
import com.hqhw.dao.FilesNewsMapper;
import com.hqhw.dao.FilesPictureMapper;
import com.hqhw.dao.FilesVideomanagerMapper;
import com.hqhw.mapper.ActivityMapper;
import com.hqhw.mapper.NewsMapper;
import com.hqhw.mapper.SpecialMapper;
import com.hqhw.pageLoad.server.HomepageLoadServer;
import com.hqhw.pojo.Activity;
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
	
	@Autowired
	FilesPictureMapper fpm;
	
	@Autowired
	ActivityFilesMapper acfm;
	
	@Autowired
	ActivityMapper am;
	
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
		
		List<AdvertisementFiles> advertisementInThree = new ArrayList<AdvertisementFiles>();
		List<ActivityFiles> aLastTwoHWHDActivity = new ArrayList<ActivityFiles>();
		List<FilesPicture> endPictureForty = new ArrayList<FilesPicture>();
		List<Activity> aSSHDAcitvityTen = new ArrayList<Activity>();
		List<Activity> aHWHDAcitvityTen = new ArrayList<Activity>();
		List<Activity> aJYHDAcitvityTen = new ArrayList<Activity>();
		Map<String, Object> map = new HashMap<String, Object>();
		List<News> nHWGYNewsTen = new ArrayList<News>();
		ActivityFiles aendSSHDActivity = new ActivityFiles();
		ActivityFiles af = new ActivityFiles();
		FilesNews fn = new FilesNews();
		
//		查找最新的四十张图库图片path
		endPictureForty = fpm.findEndPictureForty();
		
//		查找带图片的户外公益资讯id，title
		fn = fnm.findEndHWGYNews();
		
//		查找除最新一篇外的十篇户外公益资讯id，title
		nHWGYNewsTen = nm.findHWGYNewsTen();
		
//		查找最新交友活动类型活动的id，name，path
		af = acfm.findEndJYHDActivity();
		
//		查找除最新一篇外10篇交友活动类型活动的id，name
		aJYHDAcitvityTen = am.findJYHDAcitvityTen();
		
//		查找a3位置的6幅广告图
		advertisementInThree = afm.findAdvertisementInAThree();
		
//		查找最新赛事活动类型活动的id，name，path
		aendSSHDActivity = acfm.findEndSSHDActivity();
		
//		查找最新两条户外活动类型活动的id，name，path
		aLastTwoHWHDActivity = acfm.findLastTwoHWHDActivity();
		
//		查找除最新一篇外10篇赛事活动类型活动的id，name
		aSSHDAcitvityTen = am.findSSHDAcitvityTen();
		
//		查找除最新两篇外10篇户外活动类型活动的id，name
		aHWHDAcitvityTen = am.findHWHDAcitvityTen();
		
//		户外活动
		
		map.put("endPictureForty", endPictureForty);
		map.put("fn", fn);
		map.put("nHWGYNewsTen", nHWGYNewsTen);
		map.put("af", af);
		map.put("aJYHDAcitvityTen", aJYHDAcitvityTen);
		map.put("advertisementInThree", advertisementInThree);
		map.put("aendSSHDActivity", aendSSHDActivity);
		map.put("aLastTwoHWHDActivity", aLastTwoHWHDActivity);
		map.put("aSSHDAcitvityTen", aSSHDAcitvityTen);
		map.put("aHWHDAcitvityTen", aHWHDAcitvityTen);
		return cu.mapToJson(map);
		
	}

}
