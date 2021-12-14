package com.springbootsk.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootsk.jwt.bean.Shopkeeperdetails;
import com.springbootsk.jwt.bean.ThingDetials;
import com.springbootsk.jwt.repo.SkRepo;

@Service
public class SkService {
	
	@Autowired
	private SkRepo skrep;

	public Shopkeeperdetails skadd(ThingDetials thingd) {
		
		 Shopkeeperdetails userEntity = new Shopkeeperdetails();
	        userEntity.setSkusername(thingd.getTdusername());
	        userEntity.setSkfullname(thingd.getTdfullname());
	        userEntity.setSkpassword(thingd.getTdpassword());
	        userEntity.setSkemailid(thingd.getTdemailid());
	        
	        return userEntity = skrep.save(userEntity);
       
	}
	
	public Shopkeeperdetails skfetch(Shopkeeperdetails shopkeeperdetails)
	{
		Shopkeeperdetails sentity=new Shopkeeperdetails();
		sentity=skrep.findBySkusernameAndSkpassword(shopkeeperdetails.getSkusername(),shopkeeperdetails.getSkpassword());
		return sentity;
	}

	public List<Shopkeeperdetails> skfetch() {
		List<Shopkeeperdetails> shopkeeperdetails=(List<Shopkeeperdetails>) skrep.findAll();
		return shopkeeperdetails;
	}
	
}
