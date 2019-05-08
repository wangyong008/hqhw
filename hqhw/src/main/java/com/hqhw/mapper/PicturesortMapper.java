package com.hqhw.mapper;

import com.hqhw.pojo.Picturesort;
import com.hqhw.pojo.PicturesortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PicturesortMapper {
    int countByExample(PicturesortExample example);

    int deleteByExample(PicturesortExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Picturesort record);

    int insertSelective(Picturesort record);

    List<Picturesort> selectByExample(PicturesortExample example);

    Picturesort selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Picturesort record, @Param("example") PicturesortExample example);

    int updateByExample(@Param("record") Picturesort record, @Param("example") PicturesortExample example);

    int updateByPrimaryKeySelective(Picturesort record);

    int updateByPrimaryKey(Picturesort record);
}