package com.spring.jwt.repo;

import org.springframework.data.repository.CrudRepository;

import com.spring.jwt.bean.UserTC;

public interface UserRepo extends CrudRepository<UserTC, Integer> {

	UserTC findByUsername(String username);

}
