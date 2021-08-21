package com.crisite.pojo;

public class UserTwo {
	private String name;
	
	public UserTwo() {
		System.out.println("UserTwo被创建了");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println("name="+name);
	}
}
