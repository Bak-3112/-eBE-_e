<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" import="java.sql.*"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Displayform</title>
</head>
<body>
<h1>Entered User Info</h1>
<%
	//String id=request.getParameter("id");
	String firstname=request.getParameter("first_name");
	String lastname=request.getParameter("last_name");
	String emailid=request.getParameter("email");
	String contact=request.getParameter("contactno");
	String gender=request.getParameter("gender");
	
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/serviceform","root","Bingi@331");
		Statement st=con.createStatement();
		st.executeUpdate("insert into fform(firstname,lastname,emailid,contact,gender) values('"+firstname+"','"+lastname+"','"+emailid+"','"+contact+"','"+gender+"')");	
		response.sendRedirect("results.jsp");
	}
	catch(Exception e)
	{
		response.sendRedirect("error.jsp");
	}
%>
</body>
</html>