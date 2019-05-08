package com.hqhw.mapper;

import com.hqhw.pojo.Special;
import com.hqhw.pojo.SpecialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecialMapper {
	
//	查找十篇专题
	List<Special> findSpecialTen();
	
    int countByExample(SpecialExample example);

    int deleteByExample(SpecialExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Special record);

    int insertSelective(Special record);

    List<Special> selectByExampleWithBLOBs(SpecialExample example);

    List<Special> selectByExample(SpecialExample example);

    Special selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Special record, @Param("example") SpecialExample example);

    int updateByExampleWithBLOBs(@Param("record") Special record, @Param("example") SpecialExample example);

    int updateByExample(@Param("record") Special record, @Param("example") SpecialExample example);

    int updateByPrimaryKeySelective(Special record);

    int updateByPrimaryKeyWithBLOBs(Special record);

    int updateByPrimaryKey(Special record);
}