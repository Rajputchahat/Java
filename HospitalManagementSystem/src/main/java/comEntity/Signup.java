package comEntity;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;

import comDB.MyDatabase;

/**
 * Servlet implementation class User
 */
@WebServlet("/go")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signup() {
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
		
		String name = request.getParameter("fullname");
		String email = request.getParameter("email");
		String pass  = request.getParameter("password");
		
		String message = "";
		String color = "red";
		
		try
		{
			Connection con = MyDatabase.getConnection();
			Statement stmt = con.createStatement();
			String query = "insert into user_details(name,email,password) values ('"+name+"','"+email+"','"+pass+"')";
			
			int i = stmt.executeUpdate(query);
			if(i>0)
			{
				message = "Register Successfully!";
				color = "white";
			}
			else
			{
				message = "Registration Failed!";
			}
			con.close();
		}
		catch(Exception e)	
		{
			out.println(e);
		}
		request.setAttribute("message", message);
		request.setAttribute("messageColor", color);
		RequestDispatcher rd = request.getRequestDispatcher("Signup.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
  