package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	 * @return   listof all employees      alt+shift+j for java doc
	 */
	@GetMapping("employee-list")
	public List<Employee> allEmployee(){
	
		return empSerivce.getEmployee();
	}
		
		
		/**
		 * to get the details of employee by id.query function in dao always returns a list hence return type id given as list
		 * http://localhost:8080/api/employee-bydid/2
		 */
		@GetMapping("employee-bydid/{id}")
		public List<Employee> getEmplyeeDetailsById(@PathVariable int id){
		return empSerivce.getEmplyeeDetailsById(id);
	
	}
	
		/**
		 * @param employee
		 * giev details in postman body
		 * 
			"id":5,
			"first_name":"harsha",
			"last_name":"s",
			"email_address":"harsha@yahoo.com"
	
	
		* 
		 * @return
		 */
		@PostMapping("employee-create")
		public String createEmployeeDetails(@RequestBody Employee employee){
			
			return empSerivce.createEmployee(employee);
		}
			
		
		
		/**
		 * @param id
		 * @param email_address
		 * @return
		 * http://localhost:8080/api/employee-update?id=5&email_address=test@yahoo.com
		 */
		@PutMapping("employee-update")
		public String updateEmployeeDetails(@RequestParam int id,@RequestParam String email_address){
			
			return empSerivce.updateEmployee(id,email_address);
			
		}
		@DeleteMapping("employee-delete/{id}")
		public String deleteEmployeebyId(@PathVariable int id){
			
			return empSerivce.deleteEmployeebyId(id);
		
	
		}
	
	
	
	
	

}
