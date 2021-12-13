package com.springbootcrud.jdbc.bean;

public class TeachersStatusMessage {
	
	private String message;
	private boolean b1;
	private Object data;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isB1() {
		return b1;
	}
	public void setB1(boolean b1) {
		this.b1 = b1;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

}
