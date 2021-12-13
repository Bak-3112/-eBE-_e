<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<body>
	<table border="1">
		<tbody>
			<tr>
				<td>Name</td>
				<td>Model</td>
				<td>Serial No</td>
				<td>Issue</td>
			</tr>
			<%
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","Bingi@331");	
				Statement st=con.createStatement();
				ResultSet resultSet = null; 
				resultSet=st.executeQuery("select *from sftable ORDER BY id DESC LIMIT 1;");
				while(resultSet.next()){
			%>
			<tr>
				<td><%=resultSet.getString("name") %></td>
				<td><%=resultSet.getString("model") %></td>
				<td><%=resultSet.getString("serialno") %></td>
				<td><%=resultSet.getString("issue") %></td>
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
</body>
</html>