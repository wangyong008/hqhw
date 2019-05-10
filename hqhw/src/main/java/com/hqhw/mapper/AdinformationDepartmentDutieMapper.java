package com.hqhw.mapper;

import com.hqhw.pojo.AdinformationDepartmentDutie;
import com.hqhw.pojo.AdinformationDepartmentDutieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdinformationDepartmentDutieMapper {
    int countByExample(AdinformationDepartmentDutieExample example);

    int deleteByExample(AdinformationDepartmentDutieExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdinformationDepartmentDutie record);

    int insertSelective(AdinformationDepartmentDutie record);

    List<AdinformationDepartmentDutie> selectByExample(AdinformationDepartmentDutieExample example);

    AdinformationDepartmentDutie selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdinformationDepartmentDutie record, @Param("example") AdinformationDepartmentDutieExample example);

    int updateByExample(@Param("record") AdinformationDepartmentDutie record, @Param("example") AdinformationDepartmentDutieExample example);

    int updateByPrimaryKeySelective(AdinformationDepartmentDutie record);

    int updateByPrimaryKey(AdinformationDepartmentDutie record);
}