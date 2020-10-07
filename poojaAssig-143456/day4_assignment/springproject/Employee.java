package com.assignment.springproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Employee {
	private String name;
	private double salary;
	private String dob;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
	@Bean
	public Salary salary() {
		return new Salary();
		
	}
	public Employee(){}
	
	public Employee(String name, double salary, String dob, String address1, String address2, String city, String state,
			String country) {
		super();
		this.name = name;
		this.salary = salary;
		this.dob = dob;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public void display() {
		System.out.println("employee details are: " + name + "\n" + salary + "\n" + dob + "\n" + address1 + "\n"
				+ address2 + "\n" + city + "\n" + state + "\n" + country+"\n");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
