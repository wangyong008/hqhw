package com.hqhw.mapper;

import com.hqhw.pojo.Activitypeopleinfo;
import com.hqhw.pojo.ActivitypeopleinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ActivitypeopleinfoMapper {
    int countByExample(ActivitypeopleinfoExample example);

    int deleteByExample(ActivitypeopleinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Activitypeopleinfo record);

    int insertSelective(Activitypeopleinfo record);

    List<Activitypeopleinfo> selectByExample(ActivitypeopleinfoExample example);

    Activitypeopleinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Activitypeopleinfo record, @Param("example") ActivitypeopleinfoExample example);

    int updateByExample(@Param("record") Activitypeopleinfo record, @Param("example") ActivitypeopleinfoExample example);

    int updateByPrimaryKeySelective(Activitypeopleinfo record);

    int updateByPrimaryKey(Activitypeopleinfo record);
}