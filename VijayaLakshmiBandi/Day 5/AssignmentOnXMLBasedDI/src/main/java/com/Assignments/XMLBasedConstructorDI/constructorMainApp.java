package com.Assignments.XMLBasedConstructorDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class constructorMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCon = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		EmployeeConstructorDI empCon = (EmployeeConstructorDI)appCon.getBean("constructorEmployee");
		empCon.display();
	}

}
