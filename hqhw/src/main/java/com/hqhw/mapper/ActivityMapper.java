package com.hqhw.mapper;

import com.hqhw.pojo.Activity;
import com.hqhw.pojo.ActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityMapper {
	
//	查找除最新两篇外10篇户外活动类型活动的id，name
	List<Activity> findHWHDAcitvityTen();
	
//	查找除最新一篇外10篇赛事活动类型活动的id，name
	List<Activity> findSSHDAcitvityTen();

//	查找除最新一篇外10篇交友活动类型活动的id，name
	List<Activity> findJYHDAcitvityTen();
	
    int countByExample(ActivityExample example);

    int deleteByExample(ActivityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Activity record);

    int insertSelective(Activity record);

    List<Activity> selectByExampleWithBLOBs(ActivityExample example);

    List<Activity> selectByExample(ActivityExample example);

    Activity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByExampleWithBLOBs(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByExample(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKeyWithBLOBs(Activity record);

    int updateByPrimaryKey(Activity record);
}