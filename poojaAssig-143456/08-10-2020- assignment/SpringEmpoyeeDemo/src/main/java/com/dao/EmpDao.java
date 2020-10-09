package com.dao;

import java.util.List;

import com.bean.Employee;

public interface EmpDao {
	
	//list the all records
	public List<Employee> getEmployees();
	public void createEmployee(String first_name, String last_name, String email_address);
	public void updateEmployee(Integer id, String email);
	public void deleteEmployee();

}
