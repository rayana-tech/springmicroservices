package com.demo.springprojectsDIConstructorBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld
{
public static void main(String[] args) {
	//ApplicationContext context = new FileSystemXmlApplicationContext("ApplicationContext.xml")
	ApplicationContext beanFactory =new ClassPathXmlApplicationContext("ApplicationContext.xml");
	HelloWorldBean mybean=(HelloWorldBean) beanFactory.getBean("helloworldConstructorbased");
	mybean.display();
	
}
}
