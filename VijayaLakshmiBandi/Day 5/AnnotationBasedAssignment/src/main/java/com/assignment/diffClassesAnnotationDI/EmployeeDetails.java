package com.assignment.diffClassesAnnotationDI;

public class EmployeeDetails {
	private String empName;
	private int empID;
	private SalaryDetails salary;
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
	public SalaryDetails getSalary() {
		return salary;
	}
	public void setSalary(SalaryDetails salary) {
		this.salary = salary;
	}
	void display() {
		System.out.println("EmpName is "+empName+"\nEmpID is "+empID+"\nEmp Salary is "+salary);
	}
}
