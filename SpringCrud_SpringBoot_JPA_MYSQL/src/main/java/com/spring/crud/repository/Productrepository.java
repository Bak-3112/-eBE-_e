package com.spring.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.crud.bean.Product;

public interface Productrepository extends CrudRepository<Product,Integer>{

}
