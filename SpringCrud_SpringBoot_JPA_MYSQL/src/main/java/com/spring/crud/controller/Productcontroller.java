package com.spring.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crud.bean.Product;
import com.spring.crud.bean.Product1;
import com.spring.crud.service.Productservice;

@RestController
public class Productcontroller {

	@Autowired
	public Productservice productService;

	@RequestMapping(method = RequestMethod.GET, value = "/products")
	public Product1 getAllProducts() {
		List<Product> pro = productService.getAllProducts();
		Product1 pro1 = new Product1();
		if (!pro.isEmpty()) {
			pro1.setData(pro);
			pro1.setMessage("sucessfully Retrived data");
			pro1.setB1(true);
			return pro1;
		} else {
			pro1.setMessage(" Fail Retrived data");
			pro1.setB1(false);
			return pro1;
		}
	}

	@RequestMapping(method = RequestMethod.POST, value = "/products/add")
	public Product1 addProduct(@RequestBody Product product) {
		Product addpro = productService.addProduct(product);
		Product1 addpro1 = new Product1();
		if (addpro.getDescription() == null || addpro.getPrice() == null || addpro.getProductname() == null
				|| addpro.getMailid() == null || addpro.getPassword() == null) {
			addpro1.setMessage("Failed added");
			addpro1.setB1(false);
			return addpro1;
		} else {
			addpro1.setData(addpro);
			addpro1.setMessage("Added");
			addpro1.setB1(true);
			return addpro1;
		}
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/products/update")
	public Product1 updateProduct(@RequestBody Product product) {
		try {
			Product uppro = productService.updateProduct(product);
			Product1 uppro1 = new Product1();
			uppro1.setData(uppro);
			uppro1.setMessage("sucessfully updated");
			uppro1.setB1(true);
			System.out.println("id ===========" + product.getId());
			return uppro1;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			return null;
		}
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/products/delete/{id}")
	public Product1 deleteProduct(@PathVariable int id) {

		try {
			int delpro = productService.deleteProduct(id);
			Product1 delpro1 = new Product1();
			delpro1.setData(delpro);
			delpro1.setMessage("sucessfully deleted");
			delpro1.setB1(true);
			return delpro1;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			return null;
		}
	}
}
