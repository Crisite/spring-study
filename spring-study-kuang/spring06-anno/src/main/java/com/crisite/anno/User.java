package com.crisite.anno;

import org.springframework.stereotype.Component;

// 等价于<bean id ="user" class="com.crisite.pojo.User"/>
@Component
public class User {
	public String name = "Crisite";
}
