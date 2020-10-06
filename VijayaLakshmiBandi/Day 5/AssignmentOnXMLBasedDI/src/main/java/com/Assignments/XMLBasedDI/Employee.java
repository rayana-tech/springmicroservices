package com.Assignments.XMLBasedDI;

public class Employee {
	private String empName;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	void display() {
		System.out.println("Employee name is "+empName);
	}
}
