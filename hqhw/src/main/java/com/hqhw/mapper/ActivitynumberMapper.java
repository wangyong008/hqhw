package com.hqhw.mapper;

import com.hqhw.pojo.Activitynumber;
import com.hqhw.pojo.ActivitynumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivitynumberMapper {
    int countByExample(ActivitynumberExample example);

    int deleteByExample(ActivitynumberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Activitynumber record);

    int insertSelective(Activitynumber record);

    List<Activitynumber> selectByExample(ActivitynumberExample example);

    Activitynumber selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Activitynumber record, @Param("example") ActivitynumberExample example);

    int updateByExample(@Param("record") Activitynumber record, @Param("example") ActivitynumberExample example);

    int updateByPrimaryKeySelective(Activitynumber record);

    int updateByPrimaryKey(Activitynumber record);
}