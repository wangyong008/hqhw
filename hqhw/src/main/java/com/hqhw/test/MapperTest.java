package com.hqhw.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hqhw.mapper.UsersMapper;
import com.hqhw.pojo.Users;
import com.hqhw.utils.ChangeUtil;

import net.sf.json.JSONObject;

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
	ChangeUtil tu;
	
	@Autowired
	UsersMapper user;

	@Test
	public void save() {
		Users u = new Users();
		u = user.fin();
		JSONObject j = new JSONObject();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("u", u);
		j = tu.mapToJson(map);
		System.out.println(j);
	}
}
