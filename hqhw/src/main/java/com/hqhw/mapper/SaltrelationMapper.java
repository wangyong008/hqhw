package com.hqhw.mapper;

import com.hqhw.pojo.Saltrelation;
import com.hqhw.pojo.SaltrelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaltrelationMapper {
    int countByExample(SaltrelationExample example);

    int deleteByExample(SaltrelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Saltrelation record);

    int insertSelective(Saltrelation record);

    List<Saltrelation> selectByExample(SaltrelationExample example);

    Saltrelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Saltrelation record, @Param("example") SaltrelationExample example);

    int updateByExample(@Param("record") Saltrelation record, @Param("example") SaltrelationExample example);

    int updateByPrimaryKeySelective(Saltrelation record);

    int updateByPrimaryKey(Saltrelation record);
}