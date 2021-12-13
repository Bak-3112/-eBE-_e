<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.net.*" %>
<!DOCTYPE html>
<html>
<body>
<%	
	String id=request.getParameter("id");
	String firstname=request.getParameter("first_name");
	String lastname=request.getParameter("last_name");
	String emailid=request.getParameter("email");
	String contact=request.getParameter("contactno");
	String gender=request.getParameter("gender");
try
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/serviceform","root","Bingi@331");
	PreparedStatement ps=con.prepareStatement("select * from fform where id="+id+"");
	ResultSet rs=ps.executeQuery();
	while(rs.next()){
%>
<h1 align="center">User inserted info</h1>
<table border="1" align="center">
		<tbody>
			<tr>
				<td>ID</td>
				<td><%=rs.getString("id") %></td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><%=rs.getString("firstname") %></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><%=rs.getString("lastname") %></td>
			</tr>
			<tr>
				<td>EmailID</td>
				<td><%=rs.getString("emailid") %></td>
			</tr>
			<tr>
				<td>ContactNumber</td>
				<td><%=rs.getString("contact") %></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><%=rs.getString("gender") %></td>
			</tr>
<%
}
con.close();
} 
catch (Exception e) 
{
e.printStackTrace();
}
%>
		</tbody>
	</table>
	<p align="center"><a href="Sample.jsp">Form Page</a>
</body>
</html>