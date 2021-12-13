package com.example.demo.Student.sigin.MyException;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import net.bytebuddy.implementation.bind.annotation.Super;

@ComponentScan
public class UserException  extends RuntimeException{
	String message="this is not valid data";
	public  UserException(String message) {
  super(message);
  
}
}