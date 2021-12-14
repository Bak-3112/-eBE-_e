package com.springbootsk.jwt.bean;

public class ThingDetials {
	
	private String tdusername;
	private String tdfullname;
	private String tdpassword;
	private String tdemailid;
    public String jwttoken;

	public String getTdusername() {
		return tdusername;
	}
	public void setTdusername(String tdusername) {
		this.tdusername = tdusername;
	}
	public String getTdfullname() {
		return tdfullname;
	}
	public void setTdfullname(String tdfullname) {
		this.tdfullname = tdfullname;
	}
	public String getTdpassword() {
		return tdpassword;
	}
	public void setTdpassword(String tdpassword) {
		this.tdpassword = tdpassword;
	}
	public String getTdemailid() {
		return tdemailid;
	}
	public void setTdemailid(String tdemailid) {
		this.tdemailid = tdemailid;
	}
	public String getJwttoken() {
		return jwttoken;
	}
	public void setJwttoken(String jwttoken) {
		this.jwttoken = jwttoken;
	}
	
	
}
