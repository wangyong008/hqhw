package com.hqhw.mapper;

import com.hqhw.pojo.Navigationcontent;
import com.hqhw.pojo.NavigationcontentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NavigationcontentMapper {
    int countByExample(NavigationcontentExample example);

    int deleteByExample(NavigationcontentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Navigationcontent record);

    int insertSelective(Navigationcontent record);

    List<Navigationcontent> selectByExample(NavigationcontentExample example);

    Navigationcontent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Navigationcontent record, @Param("example") NavigationcontentExample example);

    int updateByExample(@Param("record") Navigationcontent record, @Param("example") NavigationcontentExample example);

    int updateByPrimaryKeySelective(Navigationcontent record);

    int updateByPrimaryKey(Navigationcontent record);
}