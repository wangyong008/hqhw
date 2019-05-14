package com.hqhw.other.server.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aliyuncs.utils.StringUtils;
import com.hqhw.bean.CorrespondentFiles;
import com.hqhw.bean.DepartmentDutie;
import com.hqhw.dao.CorrespondentFilesMapper;
import com.hqhw.dao.DepartmentDutieMapper;
import com.hqhw.mapper.AdinformationMapper;
import com.hqhw.mapper.FilesMapper;
import com.hqhw.mapper.NewsMapper;
import com.hqhw.other.server.QueryServer;
import com.hqhw.pojo.Adinformation;
import com.hqhw.pojo.News;

@Service
public class QueryServerImpl implements QueryServer {

	@Autowired
	CorrespondentFilesMapper cfm;

	@Autowired
	AdinformationMapper am;

	@Autowired
	DepartmentDutieMapper ddm;

	@Autowired
	FilesMapper fm;
	
	@Autowired
	NewsMapper nm;

	public Map quertPersion(String name) {
		Map<String, List> map = new HashMap<String, List>();
		List<Map> work = new ArrayList<Map>();
		List<CorrespondentFiles> report = new ArrayList<CorrespondentFiles>();
		List<Adinformation> af = new ArrayList<Adinformation>();
		List<CorrespondentFiles> cf = new ArrayList<CorrespondentFiles>();

//		查找通讯员 tname,sex, phone, phone, area, email
		cf = cfm.findByName(name);
		if (!cf.isEmpty()) {
			for(CorrespondentFiles c : cf) {
				report.add(c);
			}
			map.put("report", report);
		}

//		查找管理员name, department, sex, dutie, education, phone, workarea, path, birsday
		af = am.findByName(name);
		if (!af.isEmpty()) {
			for (Adinformation a : af) {
				int id = a.getId();
				DepartmentDutie dd = new DepartmentDutie();
				Map<String, Object> workMap = new HashMap<String, Object>();
				String path = fm.findPath(id);
				if (StringUtils.isNotEmpty(a.getIdcard())) {
					String birsday = a.getIdcard().substring(6, 10) + "-" + a.getIdcard().substring(10, 12);
					workMap.put("birsday", birsday);
				}
				dd = ddm.findByAid(id);
				workMap.put("name", a.getName());
				workMap.put("department", dd.getDepartment());
				workMap.put("sex", a.getSex());
				workMap.put("dutie", dd.getDutie());
				workMap.put("education", a.getEducation());
				workMap.put("phone", a.getPhone());
				workMap.put("path", path);
				workMap.put("workarea", a.getWorkarea());
				work.add(workMap);
			}
			map.put("work", work);
		}

		return map;
	}

	public List<News> quertNews(String word) {
		List<News> l1 = new ArrayList<News>();
		List<News> l2 = new ArrayList<News>();
		List<News> news = new ArrayList<News>();
		l1 = nm.findByKeyWord(word);
		l2 = nm.findByTitleWord("%" + word + "%");
		if(!l1.isEmpty()) {
			for(News n : l1) {
				news.add(n);
			}
		}
		
		if(!l2.isEmpty()) {
			for(News n : l2) {
				news.add(n);
			}
		}
		return news;
	}

}
