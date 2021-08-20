package com.crisite.pojo;

public class Hello {
	
	private String str;
	
	private String getStr() {
		return str;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	@Override
	public String toString() {
		return "Hello{"
				+ "str='" + str + '\''+
				'}';
	}
}
