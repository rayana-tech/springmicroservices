package com.assignment.springproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//ApplicationContext context = new FileSystemXmlApplicationContext("ApplicationContext.xml")
		ApplicationContext beanFactory =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee mybean=(Employee) beanFactory.getBean("assigConstructorbased");
		mybean.display();
		Employee mybean1=(Employee) beanFactory.getBean("assigsetterbased");
		mybean1.display();
		ApplicationContext context = new AnnotationConfigApplicationContext(Employee.class);
		Salary mybean3 =(Salary) context.getBean("assigAnno", Salary.class);
		mybean3.display();
		
	}
}
