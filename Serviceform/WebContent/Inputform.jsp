<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Input form</title>
</head>
<body>
	<h3>User Information for service</h3>

	<form action="Displayformresult.jsp" method="POST">
		<table>
			<tbody>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="fullname" size="25" /></td>
				</tr>

				<tr>
					<td>Model:</td>
					<td><input type="text" name="mname" size="25" /></td>
				</tr>

				<tr>
					<td>SerialNo:</td>
					<td><input type="text" name="mserialno" size="25" /></td>
				</tr>

				<tr>
					<td>Issue:</td>
					<td><input type="text" name="custissue" size="25" /></td>
				</tr>

			</tbody>
		</table>
		
		
	 <input type = "reset" value = "Clear" name="clear"/>
 	 <input type = "submit" value = "Submit" name="submit"/>
 	
	</form>		
</body>
</html>