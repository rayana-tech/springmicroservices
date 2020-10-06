package com.Assignments.XMLBasedDIWithDifferentClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class diffMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCon = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		EmployeeDetails empDetails = (EmployeeDetails)appCon.getBean("emplBasedOnSalary");
		empDetails.displayInfo();
	}

}
