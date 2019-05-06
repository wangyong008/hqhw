package com.hqhw.mapper;

import com.hqhw.pojo.Activitypeople;
import com.hqhw.pojo.ActivitypeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivitypeopleMapper {
    int countByExample(ActivitypeopleExample example);

    int deleteByExample(ActivitypeopleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Activitypeople record);

    int insertSelective(Activitypeople record);

    List<Activitypeople> selectByExample(ActivitypeopleExample example);

    Activitypeople selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Activitypeople record, @Param("example") ActivitypeopleExample example);

    int updateByExample(@Param("record") Activitypeople record, @Param("example") ActivitypeopleExample example);

    int updateByPrimaryKeySelective(Activitypeople record);

    int updateByPrimaryKey(Activitypeople record);
}