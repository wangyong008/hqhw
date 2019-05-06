package com.hqhw.mapper;

import com.hqhw.pojo.Salt;
import com.hqhw.pojo.SaltExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaltMapper {
    int countByExample(SaltExample example);

    int deleteByExample(SaltExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Salt record);

    int insertSelective(Salt record);

    List<Salt> selectByExample(SaltExample example);

    Salt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Salt record, @Param("example") SaltExample example);

    int updateByExample(@Param("record") Salt record, @Param("example") SaltExample example);

    int updateByPrimaryKeySelective(Salt record);

    int updateByPrimaryKey(Salt record);
}