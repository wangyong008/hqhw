package com.hqhw.dao;

import java.util.List;

import com.hqhw.bean.ActivityFiles;

public interface ActivityFilesMapper {

//	查找最新交友活动类型活动的id，name，path
	ActivityFiles findEndJYHDActivity();
	
//	查找最新两条户外活动类型活动的id，name，path
	List<ActivityFiles> findLastTwoHWHDActivity();
	
//	查找最新赛事活动类型活动的id，name，path
	ActivityFiles findEndSSHDActivity();
}
