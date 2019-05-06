package com.hqhw.mapper;

import com.hqhw.pojo.Videomanager;
import com.hqhw.pojo.VideomanagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideomanagerMapper {
    int countByExample(VideomanagerExample example);

    int deleteByExample(VideomanagerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Videomanager record);

    int insertSelective(Videomanager record);

    List<Videomanager> selectByExample(VideomanagerExample example);

    Videomanager selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Videomanager record, @Param("example") VideomanagerExample example);

    int updateByExample(@Param("record") Videomanager record, @Param("example") VideomanagerExample example);

    int updateByPrimaryKeySelective(Videomanager record);

    int updateByPrimaryKey(Videomanager record);
}