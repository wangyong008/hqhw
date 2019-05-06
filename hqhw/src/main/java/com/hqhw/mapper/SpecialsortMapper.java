package com.hqhw.mapper;

import com.hqhw.pojo.Specialsort;
import com.hqhw.pojo.SpecialsortExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecialsortMapper {
    int countByExample(SpecialsortExample example);

    int deleteByExample(SpecialsortExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Specialsort record);

    int insertSelective(Specialsort record);

    List<Specialsort> selectByExample(SpecialsortExample example);

    Specialsort selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Specialsort record, @Param("example") SpecialsortExample example);

    int updateByExample(@Param("record") Specialsort record, @Param("example") SpecialsortExample example);

    int updateByPrimaryKeySelective(Specialsort record);

    int updateByPrimaryKey(Specialsort record);
}