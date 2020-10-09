package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public class EmpDaoImp implements EmpDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	class EmployeeRowMapper implements RowMapper<Employee> {

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

			Employee employee = new Employee();

			employee.setId(rs.getInt("id"));
			employee.setFirst_name(rs.getString("first_name"));
			employee.setLast_name(rs.getString("last_name"));
			employee.setEmail_address(rs.getString("email_address"));
			return employee;
		}

	}

	// get the list of emloyess // go your implement for jdbc or spring jpa in this
	// class
	public List<Employee> getEmployees() {

		String sql = "select * from employees";

		return jdbcTemplate.query(sql, new EmployeeRowMapper());

	}

	@Override
	public void createEmployee(String first_name, String last_name, String email_address) {
		String insertQuery = "insert into employees (first_name, last_name,email_address ) values (?, ?, ?)";
		jdbcTemplate.update(insertQuery, first_name, last_name, email_address);
	}

	@Override
	public void updateEmployee(Integer id, String email_address) {

		String updateQuery = "update employees set email_address = ? where id = ?";
		jdbcTemplate.update(updateQuery, email_address, id);

	}

	@Override
	public void deleteEmployee() {
		String deleteQuery = "delete from employees";
		jdbcTemplate.update(deleteQuery);
	}

}
