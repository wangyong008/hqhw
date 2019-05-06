package com.hqhw.mapper;

import com.hqhw.pojo.Activitysort;
import com.hqhw.pojo.ActivitysortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivitysortMapper {
    int countByExample(ActivitysortExample example);

    int deleteByExample(ActivitysortExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Activitysort record);

    int insertSelective(Activitysort record);

    List<Activitysort> selectByExample(ActivitysortExample example);

    Activitysort selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Activitysort record, @Param("example") ActivitysortExample example);

    int updateByExample(@Param("record") Activitysort record, @Param("example") ActivitysortExample example);

    int updateByPrimaryKeySelective(Activitysort record);

    int updateByPrimaryKey(Activitysort record);
}