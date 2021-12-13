package com.springbootsk.jwt.util;

import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class ShopkeeperJwtUtil {
	
	private static String secret = "This_is_secret";
    private static long expiryDuration = 60 * 60;


	public String generatetoken(int skpassword) {
		Claims claims = Jwts.claims()
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + expiryDuration *1000));
        claims.put("id", skpassword);
       
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

}
