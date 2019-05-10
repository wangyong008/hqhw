package com.hqhw.mapper;

import com.hqhw.pojo.Dutie;
import com.hqhw.pojo.DutieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DutieMapper {
    int countByExample(DutieExample example);

    int deleteByExample(DutieExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dutie record);

    int insertSelective(Dutie record);

    List<Dutie> selectByExample(DutieExample example);

    Dutie selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dutie record, @Param("example") DutieExample example);

    int updateByExample(@Param("record") Dutie record, @Param("example") DutieExample example);

    int updateByPrimaryKeySelective(Dutie record);

    int updateByPrimaryKey(Dutie record);
}