package com.hqhw.mapper;

import com.hqhw.pojo.News;
import com.hqhw.pojo.NewsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface NewsMapper {
	
//	  根据文章分类查找最新的n篇文章  
	List<News> findBySort(String name);
	
	/**
	 * 根据关键字和标题对文章模糊查询
	 * 注意，传入的时候先把百分号加上
	 */
	List<News> findBySeTi(News n);
	
    int countByExample(NewsExample example);

    int deleteByExample(NewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(News record);

    int insertSelective(News record);

    List<News> selectByExampleWithBLOBs(NewsExample example);

    List<News> selectByExample(NewsExample example);

    News selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    int updateByExampleWithBLOBs(@Param("record") News record, @Param("example") NewsExample example);

    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKeyWithBLOBs(News record);

    int updateByPrimaryKey(News record);
}