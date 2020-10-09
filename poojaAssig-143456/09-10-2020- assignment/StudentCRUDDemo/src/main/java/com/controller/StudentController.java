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

import com.bean.Student;
import com.service.StudentService;

@RestController
@RequestMapping(value=("/api"))
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("student-list")
	public List<Student> getListOfstudents(){
		return studentService.getStudent();
		
	}
	@PostMapping("create-student/{name}/{bloodgroup}/{email}/{mobile_no}/{address}")
	public void createstudent(@PathVariable String name, @PathVariable String bloodgroup, @PathVariable String email,@PathVariable  String mobile_no,@PathVariable String address){
		studentService.createEmployee(name, bloodgroup, email, mobile_no, address);
	}

	@PutMapping("update-student/{id}/{email}")
	public void updatestudent(@PathVariable int id, @PathVariable String email){
		studentService.updateStudent(id, email);
		
	}

	@DeleteMapping("delete-student")
	public void deletestudents(){
		studentService.deleteStudent();
		
	}

}
