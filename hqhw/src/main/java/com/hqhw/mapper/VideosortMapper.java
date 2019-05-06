package com.hqhw.mapper;

import com.hqhw.pojo.Videosort;
import com.hqhw.pojo.VideosortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideosortMapper {
    int countByExample(VideosortExample example);

    int deleteByExample(VideosortExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Videosort record);

    int insertSelective(Videosort record);

    List<Videosort> selectByExample(VideosortExample example);

    Videosort selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Videosort record, @Param("example") VideosortExample example);

    int updateByExample(@Param("record") Videosort record, @Param("example") VideosortExample example);

    int updateByPrimaryKeySelective(Videosort record);

    int updateByPrimaryKey(Videosort record);
}