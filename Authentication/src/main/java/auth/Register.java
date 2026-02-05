package auth;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



/**
 * Servlet implementation class Register
 */
@WebServlet("/run")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
       response.setContentType("text/html");
       PrintWriter out = response.getWriter();
       
       String name = request.getParameter("name");
       
       String phone = request.getParameter("phone");
       
       String email = request.getParameter("email");
       
       String pass = request.getParameter("pass");
       
       try
       {
    	   Class.forName("com.mysql.cj.jdbc.Driver");
    	   
    	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/auth1","root","Root");
    	   
    	   Statement stmt=con.createStatement();
    	   
    	   String sql_query = "insert into register_user(name,phone,email,password) values ('"+name+"','"+phone+"','"+email+"','"+pass+"')";
    	  
    	   stmt.executeUpdate(sql_query);
    	   
    	   out.println("Register Successful!");
       }
       catch(Exception e)
       {
    	   out.println(e);
       }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
