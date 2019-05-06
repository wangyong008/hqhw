package com.hqhw.mapper;

import com.hqhw.pojo.Ncarea;
import com.hqhw.pojo.NcareaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NcareaMapper {
    int countByExample(NcareaExample example);

    int deleteByExample(NcareaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ncarea record);

    int insertSelective(Ncarea record);

    List<Ncarea> selectByExample(NcareaExample example);

    Ncarea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ncarea record, @Param("example") NcareaExample example);

    int updateByExample(@Param("record") Ncarea record, @Param("example") NcareaExample example);

    int updateByPrimaryKeySelective(Ncarea record);

    int updateByPrimaryKey(Ncarea record);
}