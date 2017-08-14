package com.itheima.mybatis.junit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.mybatis.dao.UserDao;
import com.itheima.mybatis.pojo.User;



/**
 * 入门程序
 * @author lx
 *
 */
public class MybatisDao {

	
	
	@Test
	public void testMybatis() throws Exception {
		ApplicationContext ac  = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = ac.getBean(UserDao.class);
	
		User user = userDao.findUserById(28);
		System.out.println(user);
	
	}
	
}
