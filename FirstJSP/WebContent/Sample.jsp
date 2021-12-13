<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Info</title>
</head>
<body>
<h2 align="center">Sample User Info Form</h2>
<form name="Sdstorage" action="processer.jsp">
		
		<table align="center">
		<tbody>
		<!-- <tr>
			<td>ID:</td>
			<td><input type = "text" name = "id" value="" size="30" /></td>
		 </tr>
		<tr> -->
			<td>First Name:</td>
			<td><input type = "text" name = "first_name" value="" size="30" /></td>
		 </tr>
		 
		 <tr>	
			<td>Last Name:</td>
			<td><input type = "text" name = "last_name" value="" size="30" /></td>
		</tr>
			
		<tr>	
			<td>Email ID:</td>
			<td><input type = "text" name = "email" value="" size="30" /></td>
		</tr>
			
		<tr>
			<td>Contact No:</td>
			<td><input type = "text" name = "contactno" value="" size="30" /></td>
         </tr>
        
         <tr>
	         <td>Gender:</td>
	         <td>
	         	<select name="gender">
	         			<option>No Select</option>
	         			<option>Male</option>
	         			<option>Female</option>         
	         	 </select>
	         </td>
	      </tr>
         
         </tbody>
         </table>
      	<center>
 		 <input type = "reset" value = "Clear" name="clear"/>
 		 <input type = "submit" value = "Submit" name="submit"/>
 		</center>
 	</form>
</body>
</html>