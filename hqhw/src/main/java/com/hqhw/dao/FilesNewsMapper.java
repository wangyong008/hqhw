package com.hqhw.dao;

import com.hqhw.bean.FilesNews;

public interface FilesNewsMapper {

//	查找最新一篇社交资讯类型资讯的id，path，title	
	FilesNews findEndSJZXNews();
	
//	查找最新一篇户外公益类型资讯的id，path，title	
	FilesNews findEndHWGYNews();
}
