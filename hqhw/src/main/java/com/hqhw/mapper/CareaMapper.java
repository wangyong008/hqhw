package com.hqhw.mapper;

import com.hqhw.pojo.Carea;
import com.hqhw.pojo.CareaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CareaMapper {
    int countByExample(CareaExample example);

    int deleteByExample(CareaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Carea record);

    int insertSelective(Carea record);

    List<Carea> selectByExample(CareaExample example);

    Carea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Carea record, @Param("example") CareaExample example);

    int updateByExample(@Param("record") Carea record, @Param("example") CareaExample example);

    int updateByPrimaryKeySelective(Carea record);

    int updateByPrimaryKey(Carea record);
}