package com.crisite.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = (Student)context.getBean("student");
		System.out.println(student.toString());
	}
	
	@Test
	public void test2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanstwo.xml");
		UserTwo userTwo = context.getBean("user2",UserTwo.class);
		System.out.println(userTwo);
	}
}
