package com.service;

import java.util.List;

import com.bean.Student;


public interface StudentService {
	public List<Student> getStudent();
	public void createEmployee(String name, String bloodgroup, String email, String mobile_no, String address);
	public void updateStudent(Integer id, String email);
	public void deleteStudent();

}
