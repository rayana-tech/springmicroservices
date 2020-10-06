package com.Assignments.XMLBasedDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Assignments.XMLBasedConstructorDI.EmployeeConstructorDI;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCon = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee emp = (Employee)appCon.getBean("employee");
		emp.display();
	}

}
