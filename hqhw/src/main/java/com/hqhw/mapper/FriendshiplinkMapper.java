package com.hqhw.mapper;

import com.hqhw.pojo.Friendshiplink;
import com.hqhw.pojo.FriendshiplinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendshiplinkMapper {
	
//	查找所有友情链接
	List<Friendshiplink> findAll();
	
    int countByExample(FriendshiplinkExample example);

    int deleteByExample(FriendshiplinkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Friendshiplink record);

    int insertSelective(Friendshiplink record);

    List<Friendshiplink> selectByExample(FriendshiplinkExample example);

    Friendshiplink selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Friendshiplink record, @Param("example") FriendshiplinkExample example);

    int updateByExample(@Param("record") Friendshiplink record, @Param("example") FriendshiplinkExample example);

    int updateByPrimaryKeySelective(Friendshiplink record);

    int updateByPrimaryKey(Friendshiplink record);
}