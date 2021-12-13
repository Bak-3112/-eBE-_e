<%@page import="java.lang.reflect.Parameter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Result form</title>
</head>
<body>
<%@ page import="java.sql.*"%>
<%
	String name=request.getParameter("fullname");
	String model=request.getParameter("mname");
	String serialno=request.getParameter("mserialno");
	String issue=request.getParameter("custissue");
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","Bingi@331");	
				Statement st=con.createStatement();
				st.executeUpdate("insert into sftable (name,model,serialno,issue) values('"+name+"','"+model+"','"+serialno+"','"+issue+"')");
				response.sendRedirect("Insertedinfo.jsp");
				con.close();
			}
			catch(Exception e)
			{
				response.sendRedirect("Inputform.jsp");
			}
	
%>
</body>
</html>

