package com.assignment.annotationdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	   @Bean 
	   public EmployeeClass displayEmpName(){
	      return new EmployeeClass();
	   }
}
