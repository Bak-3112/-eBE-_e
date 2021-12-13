
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/regstor")
public class regstor extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// String id=request.getParameter("id");
		String un = request.getParameter("username");
		String pwd = request.getParameter("password");
		
//		out.println(un);
//		out.println(pwd);


		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/ja","root","Bingi@331");  
//			String query = ("insert into test(un,pwd) values('"+un+"','"+pwd+"')");
//			Statement st = con.createStatement();
//
//			st.executeQuery(query);
//			out.println("successfuly inserted");
//			st.close();
//			con.close();
			out.println("Connected");
			Statement st=con.createStatement();
					st.executeUpdate("insert into test(un,pwd) values('"+un+"','"+pwd+"')");
			
		} catch (Exception e) {
			out.println("No");
		}
	}

}