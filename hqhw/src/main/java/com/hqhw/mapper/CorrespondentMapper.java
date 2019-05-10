package com.hqhw.mapper;

import com.hqhw.pojo.Correspondent;
import com.hqhw.pojo.CorrespondentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CorrespondentMapper {
    int countByExample(CorrespondentExample example);

    int deleteByExample(CorrespondentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Correspondent record);

    int insertSelective(Correspondent record);

    List<Correspondent> selectByExample(CorrespondentExample example);

    Correspondent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Correspondent record, @Param("example") CorrespondentExample example);

    int updateByExample(@Param("record") Correspondent record, @Param("example") CorrespondentExample example);

    int updateByPrimaryKeySelective(Correspondent record);

    int updateByPrimaryKey(Correspondent record);
}