package com.ioc.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ioc.apps.beans.Employee;



@SpringBootApplication
public class IocSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(
				IocSpringApplication.class, args);
	
		Employee emp = context.getBean(Employee.class);
		emp.setEmpId(1001);
		emp.setEmpName("Suresh");
		emp.setAddress("HYD");
		emp.showEmpdails();
        
       
        
        context.close();
	}

}
