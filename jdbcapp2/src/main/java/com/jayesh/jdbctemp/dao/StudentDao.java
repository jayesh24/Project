package com.jayesh.jdbctemp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jayesh.jdbctemp.model.Student;

@Repository("studentDao") // // bean id="studentDao" in spring-servlet.xml
public class StudentDao {
	    
    JdbcTemplate template;
	
	/*
	 * this method set the JdbcTemplate by the Spring framework.
	 */
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	 
    public List<Student>  getAllStudents() {   	
   	
    	List<Student> student = template.query(
			    "select * from emp1",
			    new RowMapper() {         // RowMapper
			        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			        	Student std = new Student();
			        	std.seteid((rs.getInt("eid")));
			        	std.setFirstname(rs.getString("firstname"));
			        	std.setLastname(rs.getString("lastname"));
			        	std.setAge(((rs.getInt("age"))));
			        	std.setSalary(((rs.getInt("salary"))));
			        	std.setDepartid(((rs.getInt("departid"))));
			            
			        	return std;
			        }
			    });
         return student;
    }    
}
