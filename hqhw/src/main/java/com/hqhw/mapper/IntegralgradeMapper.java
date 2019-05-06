package com.hqhw.mapper;

import com.hqhw.pojo.Integralgrade;
import com.hqhw.pojo.IntegralgradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntegralgradeMapper {
    int countByExample(IntegralgradeExample example);

    int deleteByExample(IntegralgradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Integralgrade record);

    int insertSelective(Integralgrade record);

    List<Integralgrade> selectByExample(IntegralgradeExample example);

    Integralgrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Integralgrade record, @Param("example") IntegralgradeExample example);

    int updateByExample(@Param("record") Integralgrade record, @Param("example") IntegralgradeExample example);

    int updateByPrimaryKeySelective(Integralgrade record);

    int updateByPrimaryKey(Integralgrade record);
}