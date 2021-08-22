package com.crisite.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

@Test
public void test() {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	People people = context.getBean("people",People.class);
	people.getDog().shut();
	people.getCat().shut();
//	System.out.println(people.getName());
	people.toString();
}
}
