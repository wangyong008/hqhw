package com.hqhw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hqhw.pojo.Users;
import com.hqhw.pojo.UsersExample;

public interface UsersMapper {
	
//	根据手机号查询用户名密码
	Users findNaPaByPh(String phone);
	
//	根据手机号查询用户名密码根据邮箱查询用户名密码
	Users findNaPaByEa(String email);
	
//	查询加盐密码
	String findPasswordSalt(String name);
	
//	查询是否存在该邮箱
	String findEmail(String email);
	
//	保存用户名、邮箱、加盐密码和密码
	void saveNEP(Users u);
	
//	保存用户名、手机号、加盐密码和密码
	void saveNPP(Users u);
	
//	判断是否存在该用户名
	String findName(String name);
	
//	查询是否存在该手机号
	String findPhone(String phone);
	
    int countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}