package com.springbootsk.jwt.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootsk.jwt.bean.Shopkeeperdetails;

@Repository
public interface SkRepo extends CrudRepository<Shopkeeperdetails, Integer>{

	Shopkeeperdetails findBySkusernameAndSkpassword(String skusername, String skpassword);

}
