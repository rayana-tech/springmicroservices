package day5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeAnnotation {
	@Bean
	public EmployeeDetails empConfig() {
		return new EmployeeDetails();
	}
}