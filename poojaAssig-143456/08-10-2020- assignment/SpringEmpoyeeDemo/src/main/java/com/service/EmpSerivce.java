package com.service;

import java.util.List;

import com.bean.Employee;

public interface EmpSerivce {
	
	// view the list of records get salary
	public List<Employee> getEmployee();
	public void createEmployee(String first_name, String last_name, String email_address);
	public void updateEmployee(Integer id, String email);
	public void deleteEmployee();

}
