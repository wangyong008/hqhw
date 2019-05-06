package com.hqhw.mapper;

import com.hqhw.pojo.Barea;
import com.hqhw.pojo.BareaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BareaMapper {
	
    int countByExample(BareaExample example);

    int deleteByExample(BareaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Barea record);

    int insertSelective(Barea record);

    List<Barea> selectByExample(BareaExample example);

    Barea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Barea record, @Param("example") BareaExample example);

    int updateByExample(@Param("record") Barea record, @Param("example") BareaExample example);

    int updateByPrimaryKeySelective(Barea record);

    int updateByPrimaryKey(Barea record);
}