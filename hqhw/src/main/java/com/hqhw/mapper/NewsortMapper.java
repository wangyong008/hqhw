package com.hqhw.mapper;

import com.hqhw.pojo.Newsort;
import com.hqhw.pojo.NewsortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsortMapper {
	
//	查询所有新闻分类
	List<Newsort> findAll();
	
    int countByExample(NewsortExample example);

    int deleteByExample(NewsortExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Newsort record);

    int insertSelective(Newsort record);

    List<Newsort> selectByExample(NewsortExample example);

    Newsort selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Newsort record, @Param("example") NewsortExample example);

    int updateByExample(@Param("record") Newsort record, @Param("example") NewsortExample example);

    int updateByPrimaryKeySelective(Newsort record);

    int updateByPrimaryKey(Newsort record);
}