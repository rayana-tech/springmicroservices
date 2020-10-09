package com.example.Assign6.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
	@Autowired
	JdbcTemplate jdbc;
	
	@RequestMapping("/insert")
	public String insertOperation() {
		System.out.println("insrt operation");
		jdbc.execute("insert into user(name,email) values('amalu','amalu@yahoo.com')");
		return "Data inserted";
	}
}
