package com.hqhw.mapper;

import com.hqhw.pojo.Adinformation;
import com.hqhw.pojo.AdinformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdinformationMapper {
	
//	根据姓名查找管理员
	List<Adinformation> findByName();
	
//	根据id删除
	void deleteById();
	
//	管理员资料更新
	void update();
	
//	查询所有管理员
	List<Adinformation> selectAll();
	
//	查询账号是否存在
	String findAccount(String account);
	
//	根据账号查找加盐密码
	String findPasswordSalt(String account);
	
    int countByExample(AdinformationExample example);

    int deleteByExample(AdinformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Adinformation record);

    int insertSelective(Adinformation record);

    List<Adinformation> selectByExample(AdinformationExample example);

    Adinformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Adinformation record, @Param("example") AdinformationExample example);

    int updateByExample(@Param("record") Adinformation record, @Param("example") AdinformationExample example);

    int updateByPrimaryKeySelective(Adinformation record);

    int updateByPrimaryKey(Adinformation record);
}