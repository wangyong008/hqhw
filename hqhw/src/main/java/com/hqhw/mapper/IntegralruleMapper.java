package com.hqhw.mapper;

import com.hqhw.pojo.Integralrule;
import com.hqhw.pojo.IntegralruleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntegralruleMapper {
    int countByExample(IntegralruleExample example);

    int deleteByExample(IntegralruleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Integralrule record);

    int insertSelective(Integralrule record);

    List<Integralrule> selectByExample(IntegralruleExample example);

    Integralrule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Integralrule record, @Param("example") IntegralruleExample example);

    int updateByExample(@Param("record") Integralrule record, @Param("example") IntegralruleExample example);

    int updateByPrimaryKeySelective(Integralrule record);

    int updateByPrimaryKey(Integralrule record);
}