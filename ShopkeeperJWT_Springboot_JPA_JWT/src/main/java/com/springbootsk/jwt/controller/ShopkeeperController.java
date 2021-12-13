package com.springbootsk.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.springbootsk.jwt.bean.Shopkeeperdetails;
import com.springbootsk.jwt.bean.StatusMsg;
import com.springbootsk.jwt.bean.ThingDetials;
import com.springbootsk.jwt.service.SkService;
import com.springbootsk.jwt.util.ShopkeeperJwtUtil;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;

@RestController
public class ShopkeeperController {

	@Autowired
	private SkService service;

	@Autowired
	private ShopkeeperJwtUtil jwttoken;

	@RequestMapping(method = RequestMethod.POST, value = "/shopkeeper/add")
	public StatusMsg skadd(@RequestBody ThingDetials thingd) {
		Shopkeeperdetails skd = service.skadd(thingd);
		StatusMsg sms = new StatusMsg();
		if (skd.getSkusername() == null || skd.getSkpassword() == null || skd.getSkfullname() == null
				|| skd.getSkemailid() == null) {
			sms.setMessage("Failed added");
			sms.setStatus(false);
			return sms;
		} else {
			sms.setData(skd);
			sms.setMessage("Added");
			sms.setStatus(true);
			return sms;
		}
	}

	@RequestMapping(method = RequestMethod.POST, value = "/shopkeeper/retrive")
	public StatusMsg skfetch(@RequestBody Shopkeeperdetails shopkeeperdetails) {
		Shopkeeperdetails stud1 = service.skfetch(shopkeeperdetails);
		StatusMsg sms = new StatusMsg();
		String token = jwttoken.generatetoken(stud1.getId());
		stud1.setToken(token);
		sms.setMessage("succussfully fetched");
		sms.setStatus(true);
		sms.setData(stud1);
		return sms;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/shopkeeper/decodetoken")
	public StatusMsg skdecode(@RequestHeader String Authorization) {
		Jws<Claims> parser=jwttoken.verify(Authorization);
		List<Shopkeeperdetails> stud1 = service.skfetch();
		StatusMsg sms = new StatusMsg();
		sms.setMessage("Sussfully fatched");
		sms.setStatus(true);
		sms.setData(stud1);
		return sms;

	}
}
