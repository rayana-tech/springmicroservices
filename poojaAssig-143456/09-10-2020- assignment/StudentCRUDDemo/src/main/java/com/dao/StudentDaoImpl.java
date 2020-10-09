package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bean.Student;

@Repository
public class StudentDaoImpl implements StudentDao{
	
@Autowired
	JdbcTemplate jdbcTemplate;
public class StudentMapper implements RowMapper<Student>{
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student=new Student();
		student.setId(student.getId());
		student.setName(student.getName());
		student.setBlood_group(student.getBlood_group());
		student.setEmail(student.getEmail());
		student.setMobile_no(student.getMobile_no());
		student.setAddress(student.getAddress());
		return student;
	}
}

	@Override
	public List<Student> getStudent() {
		String selectQuery="select * from Student";
		return jdbcTemplate.query(selectQuery, new StudentMapper());
	}

	@Override
	public void createEmployee(String name, String bloodgroup, String email, String mobile_no, String address) {
		String insertQuery="insert into student(name,bloodgroup,email,mobile_no,address) values(?,?,?,?,?)";
		jdbcTemplate.update(insertQuery, name, bloodgroup,  email,mobile_no, address );
	}

	@Override
	public void updateStudent(Integer id, String email) {
       String updateQuery="update Student set email=? where id=?";
       jdbcTemplate.update(updateQuery,email,id);
	}

	@Override
	public void deleteStudent() {
	String deletequery="delete from Student";
	 jdbcTemplate.update(deletequery);
		
	}

}
