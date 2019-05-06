package com.hqhw.mapper;

import com.hqhw.pojo.Tests;
import com.hqhw.pojo.TestsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestsMapper {
    int countByExample(TestsExample example);

    int deleteByExample(TestsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tests record);

    int insertSelective(Tests record);

    List<Tests> selectByExample(TestsExample example);

    Tests selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tests record, @Param("example") TestsExample example);

    int updateByExample(@Param("record") Tests record, @Param("example") TestsExample example);

    int updateByPrimaryKeySelective(Tests record);

    int updateByPrimaryKey(Tests record);
}