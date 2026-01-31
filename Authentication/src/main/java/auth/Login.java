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
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class Login
 */
@WebServlet("/go")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
	   
	   String email =  request.getParameter("email");
	   String pass = request.getParameter("pass");
	   
	   try
	   {
		  
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   
		   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/auth1","root","Root");
		   
		   String query = "select * from register_user";
		   
		   PreparedStatement stmt = con.prepareStatement(query);
		   
		   ResultSet rs = stmt.executeQuery();
		   
		   boolean flag = false;
		   
		   while(rs.next())
		   {
			   String e = rs.getString(3);
			   String p = rs.getString(4);
			   
			   if(e.equals(email) && p.equals(pass))
			   {
				   flag = true;
			   }
		   }
		   
		   if(flag)
		   {
			   out.println("Login Successful!");
		   }
		   else
		   {
			   out.println("Invalid User");
		   }
		   
	   }
		catch(Exception e)
	   {
		   System.out.println(e);
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
