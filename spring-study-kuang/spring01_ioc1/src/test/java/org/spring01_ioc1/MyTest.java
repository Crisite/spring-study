package org.spring01_ioc1;

import org.dao.UserDaoMysql;
import org.dao.UserDaoOracle;
import org.service.UserService;
import org.service.UserServiceImpl;

public class MyTest {
	public static void main(String[] args) {
//		老方法
//		用户直接调用的是业务层 dao层无需接触
		UserService userService = new UserServiceImpl() ;
		
//		优化后只需要调整参数即可， 对象的创建由用户决定
//		而不是再由代码写死，这就是控制反转的核心思想
		((UserServiceImpl) userService).setUserDao(new UserDaoOracle());
		userService.getUser();

	}
}
