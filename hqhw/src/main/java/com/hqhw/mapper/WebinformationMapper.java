package com.hqhw.mapper;

import com.hqhw.pojo.Webinformation;
import com.hqhw.pojo.WebinformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebinformationMapper {
    int countByExample(WebinformationExample example);

    int deleteByExample(WebinformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Webinformation record);

    int insertSelective(Webinformation record);

    List<Webinformation> selectByExample(WebinformationExample example);

    Webinformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Webinformation record, @Param("example") WebinformationExample example);

    int updateByExample(@Param("record") Webinformation record, @Param("example") WebinformationExample example);

    int updateByPrimaryKeySelective(Webinformation record);

    int updateByPrimaryKey(Webinformation record);
}