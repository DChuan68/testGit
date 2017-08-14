package com.itheima.mybatis.dao;

import com.itheima.mybatis.pojo.User;

public interface UserDao {
	
	//根据用户Id查询用户
	public User findUserById(Integer id);

}
