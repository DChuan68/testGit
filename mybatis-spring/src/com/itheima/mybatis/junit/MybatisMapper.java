package com.itheima.mybatis.junit;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.mybatis.mapper.OrdersMapper;
import com.itheima.mybatis.mapper.UserMapper;
import com.itheima.mybatis.pojo.Orders;
import com.itheima.mybatis.pojo.OrdersExample;
import com.itheima.mybatis.pojo.User;



/**
 * 入门程序
 * @author lx
 *
 */
public class MybatisMapper {
	
	@Test
	public void testMybatis() throws Exception {
		ApplicationContext ac  = new ClassPathXmlApplicationContext("applicationContext.xml");
	
//		UserMapper userMapper = (UserMapper) ac.getBean("userMapper");
		//增强版
//		UserMapper userMapper = ac.getBean(UserMapper.class);
		
//		User user = userMapper.findUserById(28);
//		System.out.println(user);
		
		OrdersMapper orderMapper = ac.getBean(OrdersMapper.class);
		
		
//		Orders orders = orderMapper.selectByPrimaryKey(5);
//		System.out.println(orders.getId() + ":" + orders.getNumber());
		
		OrdersExample example = new OrdersExample();
		example.createCriteria().andUserIdEqualTo(1);
		List<Orders> ordersList = orderMapper.selectByExample(example);
		for (Orders orders2 : ordersList) {
			System.out.println(orders2.getId() + ":" + orders2.getNumber());
		}
//		orderMapper.in
		
	}
	
}
