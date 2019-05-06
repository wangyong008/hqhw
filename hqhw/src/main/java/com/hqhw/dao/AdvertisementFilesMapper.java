package com.hqhw.dao;

import java.util.List;

import com.hqhw.bean.AdvertisementFiles;

public interface AdvertisementFilesMapper {

//根据广告位置查找广告的路径、连接和位置
	List<AdvertisementFiles> findPAL(String addre);
}
