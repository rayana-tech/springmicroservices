package com.assignment.setterannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SetterMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCon = new AnnotationConfigApplicationContext(SetterEmpConfig.class);
		SetterEmployee setEmp = (SetterEmployee)appCon.getBean(SetterEmployee.class);
		setEmp.setEmpID(200);
		setEmp.setEmpName("lakshmi");
		setEmp.setSalary(9000000);
		setEmp.display();
	}

}
