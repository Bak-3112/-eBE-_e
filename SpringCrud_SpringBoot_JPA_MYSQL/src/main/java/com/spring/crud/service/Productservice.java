package com.spring.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.bean.Product;
import com.spring.crud.repository.Productrepository;

@Service
public class Productservice {
	
	@Autowired
	public Productrepository productRepo;
	
	public List<Product> getAllProducts()
	{
		List<Product> products = new ArrayList<>();
		productRepo.findAll().forEach(products::add);
		return products;
	}

	public Product addProduct(Product product) {
		return productRepo.save(product);
		
	}

	public Product updateProduct(Product product) {
		return	productRepo.save(product);
			
	}

	public int deleteProduct(int id) {
		
		productRepo.deleteById(id);
		return id;
		
	}


}
