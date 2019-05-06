package com.hqhw.mapper;

import com.hqhw.pojo.Reporter;
import com.hqhw.pojo.ReporterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReporterMapper {
	
//	根据姓名查询通讯员
	List<Reporter> findByName(); 
	
    int countByExample(ReporterExample example);

    int deleteByExample(ReporterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Reporter record);

    int insertSelective(Reporter record);

    List<Reporter> selectByExample(ReporterExample example);

    Reporter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Reporter record, @Param("example") ReporterExample example);

    int updateByExample(@Param("record") Reporter record, @Param("example") ReporterExample example);

    int updateByPrimaryKeySelective(Reporter record);

    int updateByPrimaryKey(Reporter record);
}