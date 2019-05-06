package com.hqhw.mapper;

import com.hqhw.pojo.Activityimage;
import com.hqhw.pojo.ActivityimageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityimageMapper {
    int countByExample(ActivityimageExample example);

    int deleteByExample(ActivityimageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Activityimage record);

    int insertSelective(Activityimage record);

    List<Activityimage> selectByExample(ActivityimageExample example);

    Activityimage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Activityimage record, @Param("example") ActivityimageExample example);

    int updateByExample(@Param("record") Activityimage record, @Param("example") ActivityimageExample example);

    int updateByPrimaryKeySelective(Activityimage record);

    int updateByPrimaryKey(Activityimage record);
}