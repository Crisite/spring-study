package org.spring01_ioc1;

import org.dao.UserDaoMysql;
import org.dao.UserDaoOracle;
import org.service.UserService;
import org.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	public static void main(String args[]) {
//		老方法
//		用户直接调用的是业务层 dao层无需接触
		UserService userService = new UserServiceImpl() ;
		
//		优化后
//		只需要调整参数即可， 对象的创建由用户决定
//		而不是再由代码写死，程序不再主动创建对象，而是被动的接收对象
//		这就是控制反转的核心思想
		((UserServiceImpl) userService).setUserDao(new UserDaoOracle());
		userService.getUser();

//		SpringBean
//		获取SApplicationContext 拿到Spring的容器
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		容器在手，需要什么就get什么
		UserServiceImpl userServiceImpl = (UserServiceImpl)context.getBean("oracleImpl");
		userServiceImpl.getUser();
	}
}
