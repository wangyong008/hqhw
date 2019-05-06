package com.hqhw.mapper;

import com.hqhw.pojo.Outaccount;
import com.hqhw.pojo.OutaccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutaccountMapper {
    int countByExample(OutaccountExample example);

    int deleteByExample(OutaccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Outaccount record);

    int insertSelective(Outaccount record);

    List<Outaccount> selectByExample(OutaccountExample example);

    Outaccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Outaccount record, @Param("example") OutaccountExample example);

    int updateByExample(@Param("record") Outaccount record, @Param("example") OutaccountExample example);

    int updateByPrimaryKeySelective(Outaccount record);

    int updateByPrimaryKey(Outaccount record);
}