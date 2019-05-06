package com.hqhw.mapper;

import com.hqhw.pojo.Nbarea;
import com.hqhw.pojo.NbareaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NbareaMapper {
    int countByExample(NbareaExample example);

    int deleteByExample(NbareaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Nbarea record);

    int insertSelective(Nbarea record);

    List<Nbarea> selectByExample(NbareaExample example);

    Nbarea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Nbarea record, @Param("example") NbareaExample example);

    int updateByExample(@Param("record") Nbarea record, @Param("example") NbareaExample example);

    int updateByPrimaryKeySelective(Nbarea record);

    int updateByPrimaryKey(Nbarea record);
}