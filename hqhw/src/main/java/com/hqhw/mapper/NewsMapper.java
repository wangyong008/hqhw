package com.hqhw.mapper;

import com.hqhw.pojo.News;
import com.hqhw.pojo.NewsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface NewsMapper {
	
//	查找十篇汽车资讯类型资讯
	List<News> findQCZXNewsTen();
	
//	查找十篇户外社区类型资讯
	List<News> findHWSQNewsTen();
	
//	查找十篇社交资讯类型资讯
	List<News> findSJZXNewsTen();
	
//	查找十篇户外资讯类型资讯
	List<News> findHWZXNewsTen();
	
//	查找推荐的户外资讯类型资讯
	News findHWZXRecommendNews();
	
//	查询头条文章
	News findTopNews();
	
//	 根据关键字和标题对文章模糊查询注意，传入的时候先把百分号加上
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