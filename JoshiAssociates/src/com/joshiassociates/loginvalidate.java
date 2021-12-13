package com.joshiassociates;

import java.io.IOException;
import java.sql.*;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginvalidate")
public class loginvalidate extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		response.setContentType("text/html");  
        PrintWriter pw=response.getWriter();  
        String username=request.getParameter("username");  
        String password=request.getParameter("password");  
        pw.println("<html><body>");  
        try   
        {  
        	  Class.forName("com.mysql.jdbc.Driver");
        	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/joshiassociates", "root",
  					"Bingi@331");
              PreparedStatement ps= con.prepareStatement("select * from login where un=? and pwd=?");  
              ps.setString(1, username);  
              ps.setString(2, password);  
              ResultSet rs=ps.executeQuery();  
              if(rs.next())  
              {  
                    pw.println("<center><h3>welcome " +" " + username +"</h3><center>");  
                    //response.sendRedirect("./home.html");   
              }  
              else  
              {  
                    pw.println("<center><h3 margin-top: 250px;>invalid username/password Enter Correct username/password</h3></center></p>");
                    response.setHeader("Refresh", "5; URL=http://localhost:8080/JoshiAssociates/Login.jsp");
              }  
        }  
        catch (Exception e)   
        {  
              e.printStackTrace();  
        }  
	}   
}


