<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New User Registration</title>
<style>
p {
	margin-top: 250px;
}
</style>
</head>
<body>
	<form action="Registrationstorage" method="post">
		<center>
			<p>
			<h3 style="font: Times New Roman; color: Red;">Please enter the
				details</h3>
			<table style="with: 20%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="first_name" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="last_name" /></td>
				</tr>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>Contact No</td>
					<td><input type="text" name="contact" /></td>
				</tr>
			</table>
			<input type="submit" value="Submit" />
	</form>
</body>
</html>
</body>
</html>