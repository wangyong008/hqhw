package com.hqhw.pageLoad.controller;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hqhw.pageLoad.server.Impl.HomepageLoadServerImpl;

@Controller
@RequestMapping(value = "/load")
public class HomepageLoadController {
	
	@Autowired
	ThreadPoolTaskExecutor threadPoolTask;
	
	@Autowired
	HomepageLoadServerImpl hsi;

//	首页加载第一部分	
	@RequestMapping(value = "/homepageone")
	@ResponseBody
	public ModelAndView homepageLoadOneLoad() {
		
		ModelAndView mav = new ModelAndView();
		Future<Map<String, Object>> homePageOne = threadPoolTask.submit(new Callable<Map<String, Object>>() {

			public Map<String, Object> call() throws Exception {
				return hsi.homepageLoadOne();
			}
		});
		mav.addObject("homePageOne", homePageOne);
		mav.setViewName("");

		return mav;
	}
	
//	首页加载第二部分	
	@RequestMapping(value = "/homepagetwo")
	@ResponseBody
	public ModelAndView homepageLoadTwoLoad() {
		
		ModelAndView mav = new ModelAndView();
		Future<Map<String, Object>> homePageTwo = threadPoolTask.submit(new Callable<Map<String, Object>>() {

			public Map<String, Object> call() throws Exception {
				return hsi.homepageLoadTwo();
			}
		});
		mav.addObject("homePageOne", homePageTwo);
		mav.setViewName("");

		return mav;
	}

}
