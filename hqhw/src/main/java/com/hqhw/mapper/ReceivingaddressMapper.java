package com.hqhw.mapper;

import com.hqhw.pojo.Receivingaddress;
import com.hqhw.pojo.ReceivingaddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceivingaddressMapper {
    int countByExample(ReceivingaddressExample example);

    int deleteByExample(ReceivingaddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Receivingaddress record);

    int insertSelective(Receivingaddress record);

    List<Receivingaddress> selectByExample(ReceivingaddressExample example);

    Receivingaddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Receivingaddress record, @Param("example") ReceivingaddressExample example);

    int updateByExample(@Param("record") Receivingaddress record, @Param("example") ReceivingaddressExample example);

    int updateByPrimaryKeySelective(Receivingaddress record);

    int updateByPrimaryKey(Receivingaddress record);
}