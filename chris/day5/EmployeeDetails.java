package day5;

public class EmployeeDetails {
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
	public EmployeeDetails() {
		System.out.println("Default Constructor");
	}
	public EmployeeDetails(String empName1, int empID1, double salary1) {
		this.empName = empName1;
		this.empID = empID1;
		this.salary = salary1;
	}
	void display() {
		System.out.println("EmpName is "+empName+"\nEmpID is "+empID+"\nEmp Salary is "+salary);
	}
}
