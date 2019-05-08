package com.hqhw.dao;

import java.util.List;

import com.hqhw.bean.FilesVideomanager;

public interface FilesVideomanagerMapper {

//	查找推荐视频
	FilesVideomanager findTopVideo();
	
//	查找最新除推荐视频以外的十篇视频
	List<FilesVideomanager> findVideoTen();
}
