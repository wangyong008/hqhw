package com.hqhw.mapper;

import com.hqhw.pojo.Substation;
import com.hqhw.pojo.SubstationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubstationMapper {
    int countByExample(SubstationExample example);

    int deleteByExample(SubstationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Substation record);

    int insertSelective(Substation record);

    List<Substation> selectByExample(SubstationExample example);

    Substation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Substation record, @Param("example") SubstationExample example);

    int updateByExample(@Param("record") Substation record, @Param("example") SubstationExample example);

    int updateByPrimaryKeySelective(Substation record);

    int updateByPrimaryKey(Substation record);
}