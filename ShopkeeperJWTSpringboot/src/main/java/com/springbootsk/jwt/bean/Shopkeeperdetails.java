package com.springbootsk.jwt.bean;

import javax.persistence.*;

@Entity
@Table(name = "shopkeeper")
public class Shopkeeperdetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String skusername;
	private String skfullname;
	private String skpassword;
	private String skemailid;
	private String skcity;
	private String token;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSkusername() {
		return skusername;
	}
	public void setSkusername(String skusername) {
		this.skusername = skusername;
	}
	public String getSkfullname() {
		return skfullname;
	}
	public void setSkfullname(String skfullname) {
		this.skfullname = skfullname;
	}
	public String getSkpassword() {
		return skpassword;
	}
	public void setSkpassword(String skpassword) {
		this.skpassword = skpassword;
	}
	public String getSkemailid() {
		return skemailid;
	}
	public void setSkemailid(String skemailid) {
		this.skemailid = skemailid;
	}
	public String getSkcity() {
		return skcity;
	}
	public void setSkcity(String skcity) {
		this.skcity = skcity;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	
}
