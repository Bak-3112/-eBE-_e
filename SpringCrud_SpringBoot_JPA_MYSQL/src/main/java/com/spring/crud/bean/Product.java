package com.spring.crud.bean;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product implements Serializable{

	private static final long serialVersionUID = -453078187257968627L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String productname;
	private String description;
	private String price;
	private String mailid;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Product(int id, String productname, String description, String price, String mailid, String password) {
		super();
		this.id = id;
		this.productname = productname;
		this.description = description;
		this.price = price;
		this.mailid = mailid;
		this.password = password;
	}
	public Product() {
	}
}
