package com.example.demo.Student.sigin.Dao;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.Student.sigin.Bean.EmployeeBean;
import com.example.demo.Student.sigin.Bean.StudentBean;

import io.jsonwebtoken.Claims;

@Repository
public class StudentDao {
	@Autowired
	JdbcTemplate template;

	public void savesignup(StudentBean stud) {
	String  sql="INSERT INTO `students_table`(`username`, `fullname`, `email`, `password`) VALUES ('"+stud.getUsername()+"','"+stud.getFullname()+"','"+stud.getEmail()+"','"+stud.getPassword()+"')";
    System.out.println("insidee form"+sql);    
	template.execute(sql);
	}

	public StudentBean fetch(StudentBean stud) {
	 String sql="SELECT * FROM `students_table` WHERE username='"+stud.getUsername()+"'AND password='"+stud.getPassword()+"'";
	 return template.queryForObject(sql,new RowMapper<StudentBean>() {

		@Override
		public StudentBean mapRow(ResultSet rs, int rowNum) throws SQLException {
			StudentBean studd=new StudentBean();
//			studd.setId(rs.getInt("id"));
			studd.setUsername(rs.getString("username"));
			studd.setFullname(rs.getString("fullname"));
			studd.setEmail(rs.getString("email"));
			studd.setPassword(rs.getString("password"));
			return studd;
		}
		});
	  
	 
	}

	public String checkadmin(Claims body) {
		String sql="select count(*)as status_count from `students_table` WHERE password='"+body.get("password")+"'AND fullname='"+body.get("username")+"'";
//		System.out.println("inside"+sql);
		return template.queryForObject("select count(*)as status_count from `students_table`WHERE password='"+body.get("password")+"'AND fullname='"+body.get("username")+"'",new RowMapper<String>() {
			@Override
		
					public String mapRow(ResultSet rs, int row) throws SQLException {
						String count = rs.getString("status_count");
						System.out.println("count"+count);
						return count;
					}
				});
	}

	public EmployeeBean fetchemployee(EmployeeBean emp) {
		String sql="SELECT * FROM `employee_tables` WHERE id='"+emp.getId()+"'";
		System.out.println("insdie"+sql);
		return template.queryForObject(sql, new RowMapper<EmployeeBean>(){
			@Override
		public EmployeeBean mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeeBean user1 = new EmployeeBean();
			 user1.setId(rs.getInt("id"));
			 user1.setFullname(rs.getString("username"));
			 user1.setFullname(rs.getString("fullname"));
			 user1.setPassword(rs.getString("password"));
			 user1.setEmailid(rs.getString("emailid"));
			 
			
			return user1;
		}
		});
	}
}
