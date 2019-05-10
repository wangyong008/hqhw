package com.hqhw.dao;

import java.util.List;

import com.hqhw.bean.CorrespondentFiles;

public interface CorrespondentFilesMapper {

//	查找通讯员tname,sex, phone, path, phone, area, email
	List<CorrespondentFiles> findByName(String name);
}
