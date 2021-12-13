package com.joshiassociates;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Registrationstorage")
public class Registrationstorage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstname = request.getParameter("first_name");
		String lastname = request.getParameter("last_name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String contact = request.getParameter("contact");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/joshiassociates","root","Bingi@331");
			String sql="insert into login(fname,lname,un,pwd,cno) values('"+firstname+"','"+lastname+"','"+username+"','"+password+"','"+contact+"')";
			Statement st=con.createStatement();
			st.executeUpdate(sql);
			response.sendRedirect("Regsuccesspage.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
