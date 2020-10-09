package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;
import com.service.EmpSerivce;

@RestController
@RequestMapping(value=("/api"))
public class Controller {
	
	// inject dependecy service
	@Autowired
	private  EmpSerivce empSerivce;
	
	/**
	 * @return         alt+shift+j for java doc
	 */
	@GetMapping("employee-list")
	public List<Employee> allEmployee(){
	
		return empSerivce.getEmployee();	
	
	}
	
	@PostMapping("employee-create/{first_name}/{last_name}/{email_address}")
	public void createEmployeeDetails(@PathVariable String first_name, @PathVariable String last_name, @PathVariable String email_address){
	
		empSerivce.createEmployee(first_name, last_name, email_address);	
	
	}
	@PutMapping("employee-update/{id}/{email}")
	public void updateEmployeeDetails(@PathVariable Integer id, @PathVariable String email){
		empSerivce.updateEmployee(id, email);
			
	
	}
	@DeleteMapping("employee-delete")
	public void deleteEmployeeDetails(){
		empSerivce.deleteEmployee();	
	
	}
	

	
	
	
	
	
	
	

}
