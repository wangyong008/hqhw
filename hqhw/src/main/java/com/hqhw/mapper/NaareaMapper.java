package com.hqhw.mapper;

import com.hqhw.pojo.Naarea;
import com.hqhw.pojo.NaareaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NaareaMapper {
    int countByExample(NaareaExample example);

    int deleteByExample(NaareaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Naarea record);

    int insertSelective(Naarea record);

    List<Naarea> selectByExample(NaareaExample example);

    Naarea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Naarea record, @Param("example") NaareaExample example);

    int updateByExample(@Param("record") Naarea record, @Param("example") NaareaExample example);

    int updateByPrimaryKeySelective(Naarea record);

    int updateByPrimaryKey(Naarea record);
}