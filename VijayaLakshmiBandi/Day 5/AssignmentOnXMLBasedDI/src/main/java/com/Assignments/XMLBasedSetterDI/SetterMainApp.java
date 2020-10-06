package com.Assignments.XMLBasedSetterDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Assignments.XMLBasedDI.Employee;

public class SetterMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCon = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		EmployeeSetterDI empSetterID = (EmployeeSetterDI)appCon.getBean("setterEmployee");
		empSetterID.display();
	}

}
