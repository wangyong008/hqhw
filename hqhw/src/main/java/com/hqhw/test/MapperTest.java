package com.hqhw.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hqhw.bean.AdvertisementFiles;
import com.hqhw.dao.AdvertisementFilesMapper;

/**
 * 测试dao层的工作
 * 
 * @author lfy 推荐Spring的项目就可以使用Spring的单元测试，可以自动注入我们需要的组件 1、导入SpringTest模块
 *         2、@ContextConfiguration指定Spring配置文件的位置 3、直接autowired要使用的组件即可
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class MapperTest {

	@Autowired
	AdvertisementFilesMapper tu;

	@Test
	public void save() {
		List<AdvertisementFiles> l = new ArrayList<AdvertisementFiles>();
		l = tu.findPAL("a1");
		for(AdvertisementFiles af : l) {
			System.out.println(af.getPath());
		}
	}
}
