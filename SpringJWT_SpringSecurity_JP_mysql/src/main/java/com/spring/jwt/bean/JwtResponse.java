package com.spring.jwt.bean;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = 8005669431262629736L;
	
	private String jwttoken;

	public String getJwttoken() {
		return this.jwttoken;
	}

	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}
	
	
}
