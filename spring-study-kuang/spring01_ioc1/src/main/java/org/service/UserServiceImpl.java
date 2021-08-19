package org.service;

import org.dao.UserDao;
import org.dao.UserDaoImpl;
import org.dao.UserDaoMysql;

public class UserServiceImpl implements UserService{
//	老方法
//	private UserDao userDao = new UserDaoImpl();
	
//	当需要更换方法时，需要修改service层代码
//	private UserDao userDao = new UserDaoMysql();

	// 优化方法 使用set进行动态实现值的注入
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void getUser() {		
		userDao.getUser();
	}

	
}
