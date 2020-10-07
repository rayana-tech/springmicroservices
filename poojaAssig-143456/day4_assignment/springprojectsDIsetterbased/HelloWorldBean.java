package com.demo.springprojectsDIsetterbased;

public class HelloWorldBean {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
public void display() {
		
		System.out.println("your name is: "+name);
		
	}
	
}
