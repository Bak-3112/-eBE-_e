package com.springbootcrud.jdbc.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.springbootcrud.jdbc.Repository.TeachersRepo;
import com.springbootcrud.jdbc.bean.Teachers;
import com.springbootcrud.jdbc.bean.TeachersStatusMessage;
import com.springbootcrud.jdbc.util.JwtUtil;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;

@RestController
@RequestMapping("/api")
public class TeacherController {

	@Autowired
	private TeachersRepo techrepo;
	
	@Autowired
	private JwtUtil jwttoken;
	
	
	Logger logger = LoggerFactory.getLogger(Teachers.class);

	@RequestMapping(value = "/teachers/getall", method = RequestMethod.GET)
	public TeachersStatusMessage getall(@RequestHeader String Authorization) {
		Jws<Claims> parser=jwttoken.verify(Authorization);
		List<Teachers> teachie = techrepo.getall();
		TeachersStatusMessage tsm = new TeachersStatusMessage();
		logger.info("Fetching.........", teachie);
		if (!teachie.isEmpty()) {
			tsm.setData(teachie);
			tsm.setMessage("sucessfully Retrived data");
			logger.info("Wow....fetched");
			tsm.setB1(true);
			return tsm;
		} else {
			tsm.setMessage(" Fail Retrived data");
			logger.error("ohhh...Programmer...Unable to retrive");
			tsm.setB1(false);
			return tsm;
		}

	}

	@RequestMapping(value = "/teachers/add", method = RequestMethod.POST)
	public TeachersStatusMessage addTeachers(@RequestBody Teachers teach,@RequestHeader String Authorization) {
		Jws<Claims> parser=jwttoken.verify(Authorization);
		Teachers tea = techrepo.addTeachers(teach);
		TeachersStatusMessage tsm = new TeachersStatusMessage();
		logger.info("Adding.........");
		if (tea.getTno() == null || tea.getTname() == null || tea.getTpassword() == null) {
			tsm.setMessage("Failed added");
			logger.error("ohhh...Programmer...Unable to add");
			tsm.setB1(false);
			return tsm;
		} else {
			tsm.setData(tea);
			tsm.setMessage("Added");
			logger.info("Wow....Added");
			tsm.setB1(true);
			return tsm;
		}

	}

	@RequestMapping(value = "/teachers/update", method = RequestMethod.POST)
	public TeachersStatusMessage updateTeachers(@RequestBody Teachers teach,@RequestHeader String Authorization) {
		try {
			Jws<Claims> parser=jwttoken.verify(Authorization);
			Teachers teac = techrepo.updateTeachers(teach);
			TeachersStatusMessage tsm = new TeachersStatusMessage();
			logger.info("Updating.........");
			tsm.setData(teac);
			tsm.setMessage("sucessfully updated");
			logger.info("Wow....Updated");
			tsm.setB1(true);
			return tsm;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			logger.error("Exception");
			return null;
		}

	}

	@RequestMapping(value = "/teachers/delete/{id}", method = RequestMethod.DELETE)
	public TeachersStatusMessage deleteTeachers(@PathVariable("id") int id,@RequestHeader String Authorization) {
		try {
			int teache = techrepo.deleteTeachers(id);
			TeachersStatusMessage tsm = new TeachersStatusMessage();
			logger.info("Deleting.........");
			tsm.setData(teache);
			tsm.setMessage("sucessfully deleted");
			logger.info("Wow....Deleted");
			tsm.setB1(true);
			return tsm;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			logger.error("Exception");
			return null;
		}
	}
	
	@RequestMapping(value = "/teachers/generatetoken", method = RequestMethod.POST)
	  public TeachersStatusMessage token(@RequestBody Teachers teach)  {
			  
			  Teachers stud1= techrepo.fetch(teach);
			  TeachersStatusMessage tsm = new TeachersStatusMessage();
			  String token=jwttoken.generatetoken(stud1.getId());
			  teach.setToken(token);
			  logger.info("Generating token........");
			  tsm.setMessage("succussfully generated");
				tsm.setB1(true);
				logger.info("Wow.......Generated");
				tsm.setData(teach);
				return tsm;
	  } 
	

}
