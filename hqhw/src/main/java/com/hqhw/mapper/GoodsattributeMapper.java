package com.hqhw.mapper;

import com.hqhw.pojo.Goodsattribute;
import com.hqhw.pojo.GoodsattributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsattributeMapper {
    int countByExample(GoodsattributeExample example);

    int deleteByExample(GoodsattributeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Goodsattribute record);

    int insertSelective(Goodsattribute record);

    List<Goodsattribute> selectByExample(GoodsattributeExample example);

    Goodsattribute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Goodsattribute record, @Param("example") GoodsattributeExample example);

    int updateByExample(@Param("record") Goodsattribute record, @Param("example") GoodsattributeExample example);

    int updateByPrimaryKeySelective(Goodsattribute record);

    int updateByPrimaryKey(Goodsattribute record);
}