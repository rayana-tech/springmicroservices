package com.assignment.diffClassesAnnotationDI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeDetailsConfig {
@Bean
public EmployeeDetails empDetails() {
	return new EmployeeDetails();
}
@Bean
public SalaryDetails salDetail() {
	return new SalaryDetails();
}
}
