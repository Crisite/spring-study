package com.crisite.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class People {
	@Autowired
	private Cat cat;
	@Autowired
	private Dog dog;
	private String name;
	
	public Cat getCat() {
		return cat;
	}

	public Dog getDog() {
		return dog;
	}

	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "People [cat=" + cat + ", dog=" + dog + ", name=" + name + "]";
	}
	
	
}
