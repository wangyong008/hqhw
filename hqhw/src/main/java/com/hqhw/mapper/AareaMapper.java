package com.hqhw.mapper;

import com.hqhw.pojo.Aarea;
import com.hqhw.pojo.AareaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AareaMapper {
	
//	根据省名查找id
	int findByAreaname();
	
    int countByExample(AareaExample example);

    int deleteByExample(AareaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Aarea record);

    int insertSelective(Aarea record);

    List<Aarea> selectByExample(AareaExample example);

    Aarea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Aarea record, @Param("example") AareaExample example);

    int updateByExample(@Param("record") Aarea record, @Param("example") AareaExample example);

    int updateByPrimaryKeySelective(Aarea record);

    int updateByPrimaryKey(Aarea record);
}