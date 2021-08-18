package org.service;

import org.dao.UserDao;

public class UserService {
	public static void testService() {
		System.out.println("UserService test...");
		//调用dao模块的方法
		UserDao.testDao();
	}
}
