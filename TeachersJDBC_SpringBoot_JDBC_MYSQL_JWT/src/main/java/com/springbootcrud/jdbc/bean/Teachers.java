package com.springbootcrud.jdbc.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teachers {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String tno;
	private String tname;
	private String tpassword;
	private String token;
	

	public Teachers() {
	}
	public Teachers(int id, String tno, String tname, String tpassword) {
		super();
		this.id = id;
		this.tno = tno;
		this.tname = tname;
		this.tpassword = tpassword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTno() {
		return tno;
	}
	public void setTno(String tno) {
		this.tno = tno;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTpassword() {
		return tpassword;
	}
	public void setTpassword(String tpassword) {
		this.tpassword = tpassword;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}	
}
