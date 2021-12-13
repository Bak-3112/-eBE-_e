package com.springbootcrud.jdbc.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springbootcrud.jdbc.bean.Teachers;

@Repository
public class TeachersRepo {

	@Autowired
	private JdbcTemplate template;

	public List<Teachers> getall() {
		String query = "Select * from teach";
		return template.query(query, (rs, rownum) -> {
			return new Teachers(rs.getInt("id"), rs.getString("tno"), rs.getString("tname"), rs.getString("tpassword"));
		});

	}

	public Teachers addTeachers(Teachers teach) {
		String query = "Insert into teach(tno,tname,tpassword) values(?,?,?)";
		template.update(query, teach.getTno(), teach.getTname(), teach.getTpassword());
		return teach;
	}

	public Teachers updateTeachers(Teachers teach) {
		String query = "Update teach SET tno=?, tname = ?, tpassword = ? WHERE id = ?";
		template.update(query, teach.getTno(), teach.getTname(), teach.getTpassword(), teach.getId());
		return teach;
	}

	public int deleteTeachers(int id) {
		template.update("DELETE FROM teach WHERE id=?", id);
		return id;
	}

	public Teachers fetch(Teachers teach) 
	{
		String query= "SELECT * FROM teach WHERE tname='"+teach.getTname()+"'AND tpassword='"+teach.getTpassword()+"'";
		return template.queryForObject(query, new RowMapper<Teachers>() {
	    @Override
	        public Teachers mapRow(ResultSet rs, int rowNum) throws SQLException {
	            Teachers tec = new Teachers();
	            tec.setTname(rs.getString("tname"));
	            tec.setTpassword(rs.getString("tpassword"));
	            return tec;
	        }
	    });
	   
	}

	public List<Teachers> parser() {
		String query = "Select * from teach";
		return template.query(query, (rs, rownum) -> {
			return new Teachers(rs.getInt("id"), rs.getString("tno"), rs.getString("tname"), rs.getString("tpassword"));
		});

	}

	
}
