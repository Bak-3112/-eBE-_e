package com.example.demo.Student.sigin.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import com.example.demo.Student.sigin.Bean.EmployeeBean;
import com.example.demo.Student.sigin.Bean.StatusBean;
import com.example.demo.Student.sigin.Bean.StudentBean;
import com.example.demo.Student.sigin.Dao.StudentDao;
import com.example.demo.Student.sigin.MyException.UserException;
import com.example.demo.Student.sigin.token.jwttoken;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@RestController
@RequestMapping("/api")
public class StudentController {
@Autowired
 StudentDao sdao;
@Autowired
jwttoken jwttkn;
private static final Logger logger =LogManager.getLogger(StudentController.class);

@ApiOperation(value= "this api is user to sigup inputs(username,fullname,email,password",response=StatusBean.class)

@RequestMapping(value="/signup",method = RequestMethod.POST)
public @ResponseBody Object save(@RequestBody StudentBean stud,StatusBean sBean, HttpServletRequest request, HttpServletResponse response) throws UserException {
	try
	{
		logger.info("insideeeee signuppppp");
		sdao.savesignup(stud);
		sBean.setMessage("succussfully insertd");
		logger.info("sucessfully inserted");
		sBean.setStatus(true);
		sBean.setData(stud);
		return sBean;
		
	}
	catch (Exception e) {
		e.printStackTrace();
		sBean.setMessage("not successfull");
		logger.error("invalidd data");
		sBean.setStatus(false);
	throw new UserException("you have entered invalid username or password");
//	return sBean;
	}
}
@ApiOperation(value= "this api is user to sigin inputs(username,password",response=StatusBean.class)

  @RequestMapping(value="/sigin",method = RequestMethod.POST)
  public @ResponseBody Object sigin(@RequestBody  StudentBean stud,StatusBean sBean, HttpServletRequest request, HttpServletResponse response) throws UserException  {
	  try
	  {
		  logger.info("insideeeee signinnnnnnnnn");
		  StudentBean stud1= sdao.fetch(stud);
		  logger.info("sucessfully signined");	
		  String token=jwttkn.generateTokent(stud1.getPassword(),stud1.getFullname());
		  stud.setJwttoken(token);
		  sBean.setMessage("succussfully signedup");
			sBean.setStatus(true);
			sBean.setData(stud);
			return sBean;
			
	  }
	  catch (Exception e) {
			logger.error("invaliddd data");
			sBean.setMessage("not successfull");
			System.out.println("error"+e);
			sBean.setStatus(false);
			 throw new UserException("you have entered invalid username or password");
//return sBean;
		}
  } 
@ApiOperation(value= "this api is user to fetech the details of employee table inpust(token,id",response=StatusBean.class)

  @RequestMapping(value="/view",method = RequestMethod.POST)
  public @ResponseBody Object verify(@RequestBody EmployeeBean emp,StatusBean sBean,@RequestHeader String token, HttpServletRequest request, HttpServletResponse response) throws UserException{
	  Jws<Claims> data=jwttkn.parseJwt(token);
		Claims body=(data.getBody());
		String count=sdao.checkadmin(body);
		logger.info("status_count"+count);
		   if(count.equals("1"))
		   {
			   logger.info("authentication successfullyyy");
//			System.out.println("hoooooooooo");  
		   emp= sdao.fetchemployee(emp);
		  sBean.setMessage("succussfully");
			sBean.setStatus(true);
			sBean.setData(emp);
			return sBean;
		   }  
	  
  else
  {
	  logger.error("authentication failedddd");
			sBean.setMessage("authentication failed");
			sBean.setStatus(false);
			throw new UserException("authentication failed due to some error");
//			return sBean;
		}
	}
}
