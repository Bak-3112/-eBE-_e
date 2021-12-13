<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Joshi Associates</title>
<style>
p {
	margin-top: 250px;
}
</style>
</head>
<body>
	<form action="loginvalidate" method="post">
		<center>
			<p>
			<h1 style="font: Times New Roman; color: Blue;">Welcome</h1>
			<h3 style="font: Times New Roman; color: Red;">Please enter the
				credentials</h3>

			<table>
				<tbody>
					<tr>
						<td>Username</td>
						<td><input type="text" name="username" /></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" id="pass" name="password"
							/></td>
					</tr>
				</tbody>
			</table>
			<input type="Reset" value="Clear" />
	</form>
	<input type="submit" value="Submit" />
	</form>
	</center>
	<center>
		<a href="Newuserregistration.jsp">New User Registration</a><br> <a
			href="Forgotpassword.jsp">Forgot Passsword?</a>
		</p>
	</center>
	</form>
</body>
</html>