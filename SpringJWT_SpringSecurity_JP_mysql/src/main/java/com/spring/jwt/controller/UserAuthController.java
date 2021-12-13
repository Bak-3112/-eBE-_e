package com.spring.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.jwt.bean.JwtRequest;
import com.spring.jwt.bean.JwtResponse;
import com.spring.jwt.service.UserService;
import com.spring.jwt.util.JwtUtil;

@Controller
public class UserAuthController {

	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/authenticate")
	public JwtResponse authenticate(@RequestBody JwtRequest request) throws Exception{
	
		try {
			System.out.println("=====request==="+request.getUsername());
			System.out.println("====request===="+request.getPassword());
		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
		}catch (BadCredentialsException e) {
			throw new Exception("INVALID CREDENTIALS"+ e);
		}
		
		
		final UserDetails userDetails= userService.loadUserByUsername(request.getUsername());
		
		final String token= jwtUtil.generateToken(userDetails);
		
		return new JwtResponse(token);
	}
	
	
}
