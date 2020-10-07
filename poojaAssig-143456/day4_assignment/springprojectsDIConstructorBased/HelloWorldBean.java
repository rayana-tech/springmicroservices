package com.demo.springprojectsDIConstructorBased;

public class HelloWorldBean {
	private String name;
	private int id;
	HelloWorldBean(){
		
	}
	HelloWorldBean(int id){
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
void display() {
		
		System.out.println("your id is: "+id);
		
	}
	
}
