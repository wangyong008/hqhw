package com.hqhw.dao;

import java.util.List;

import com.hqhw.bean.FilesPicture;

public interface FilesPictureMapper {

//	查找最新的四十张图库图片path
	List<FilesPicture> findEndPictureForty();
}
