package com.springbootcrud.jdbc.util;

import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


@Component
public class JwtUtil {
	
	private static String secret = "This_is_secret";
    private static long expiryDuration = 60 * 60;


	public String generatetoken(int tpassword) {
		Claims claims = Jwts.claims()
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + expiryDuration *1000));
        claims.put("id", tpassword);
       
        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
	}
	
	public Jws<Claims> verify(String verification)
	{
		Jws<Claims> jwt= Jwts.parser().setSigningKey(secret).parseClaimsJws(verification);
		return jwt;
	}

	public String generatetoken(String tname, String tpassword) {
		// TODO Auto-generated method stub
		return null;
	}

}
