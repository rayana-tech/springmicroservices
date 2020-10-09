package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmpDao;

@Service
public class EmplserviceIml implements EmpSerivce {

	@Autowired
	EmpDao empDao;

	@Override
	public List<Employee> getEmployee() {

		return empDao.getEmployees();
	}

	@Override
	public void createEmployee(String first_name, String last_name, String email_address) {
		empDao.createEmployee(first_name, last_name, email_address);
		
	}

	@Override
	public void updateEmployee(Integer id, String email) {
		empDao.updateEmployee(id, email);		
	}

	@Override
	public void deleteEmployee() {
		empDao.deleteEmployee();
		
	}

}
