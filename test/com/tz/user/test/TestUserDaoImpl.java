package com.tz.user.test;

import org.junit.Test;

import com.tz.entity.User;
import com.tz.user.dao.IUserDao;
import com.tz.util.BeanFactory;

public class TestUserDaoImpl {
	private IUserDao userDao = (IUserDao) BeanFactory.getBean("userDao");

	@Test
	public void TestSelectUser() {
		User user = userDao.selectUser("张三", "123456");
		System.out.println(user);
	}
}
