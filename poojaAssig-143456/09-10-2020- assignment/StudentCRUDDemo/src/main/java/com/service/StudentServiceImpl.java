package com.service;

import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.bean.Student;
import com.dao.StudentDao;
@Service
public class StudentServiceImpl implements StudentService {
@Autowired
StudentDao studentDao;
	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return studentDao.getStudent();	}

	@Override
	public void createEmployee(String name, String bloodgroup, String email, String mobile_no, String address) {
		studentDao.createEmployee(name, bloodgroup, email, mobile_no, address);
	}

	@Override
	public void updateStudent(Integer id, String email) {
		studentDao.updateStudent(id, email);
		
	}

	@Override
	public void deleteStudent() {
		studentDao.deleteStudent();
		
	}

}
