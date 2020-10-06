package com.assignment.annotationdi;

public class EmployeeClass {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	void display() {
		System.out.println("Display name "+name);
	}
}
