package com.itheima.mybatis.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.itheima.mybatis.pojo.User;

/**
 * 原始Dao开发
 * @author lx
 *
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {


	//根据用户Id查询用户
	public User findUserById(Integer id){
		return this.getSqlSession().selectOne("test.findUserById", id);
	}
	
	
	
}
