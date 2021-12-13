<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="refresh" content="5;URL=Login.jsp">
<title>Registration Success</title>
<style>
p {
	margin-top: 250px;
	margin-left: 600px;
}
</style>
</head>
<body>
	<p style="font: Times New Roman; color: Maroon;">
		<%
		out.println("Great! Registration Succesfully completed");
		%>
		<br> Wait for few Seconds! The Page will auto-redirected to Login
		page
	</p>
</body>
</html>