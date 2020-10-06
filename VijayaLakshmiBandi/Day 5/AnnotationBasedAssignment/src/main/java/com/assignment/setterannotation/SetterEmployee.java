package com.assignment.setterannotation;

public class SetterEmployee {
	private String empName;
	private int empID;
	private double salary;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	void display() {
		System.out.println("EmpName is "+empName+"\nEmpID is "+empID+"\nEmp Salary is "+salary);
	}
}
