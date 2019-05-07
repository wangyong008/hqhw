package com.hqhw.dao;

import java.util.List;

import com.hqhw.bean.AdvertisementFiles;
import com.hqhw.pojo.Advertisement;

public interface AdvertisementFilesMapper {

//	查找a1位置的广告返回path，id，addre
	List<AdvertisementFiles> findAdvertisementInAOne();
	
//	查找a2位置的广告path，id，addre
	List<AdvertisementFiles> findAdvertisementInATwo();
	
//	查找a3位置的广告path，id，addre
	List<AdvertisementFiles> findAdvertisementInAThree();
}
