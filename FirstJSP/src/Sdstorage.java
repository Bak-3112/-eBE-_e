	
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Sdstorage")
public class Sdstorage extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        //String id=request.getParameter("id");
        String firstname=request.getParameter("first_name");
    	String lastname=request.getParameter("last_name");
    	String emailid=request.getParameter("email");
    	String contact=request.getParameter("contactno");
    	String gender=request.getParameter("gender");
    	
    		try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/serviceform","root","Bingi@331");
                String query = ("insert into fform(firstname,lastname,emailid,contact,gender) values(,'"+firstname+"','"+lastname+"','"+emailid+"','"+contact+"','"+gender+"')");
                Statement st=con.createStatement();

                
                st.executeUpdate(query);
                out.println("successfuly inserted");
                st.close();
                con.close();
    			}
    			catch(Exception e) 
    			{
    	                e.printStackTrace();
    	        }
    	            RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
    	            rd.forward(request, response);
    	}    	
	}
}