package comEntity;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import comDB.MyDatabase;

/**
 * Servlet implementation class ChangeUserPassword
 */
@WebServlet("/CUP")
public class ChangeUserPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeUserPassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
	    String id = request.getParameter("u_id");
	    String oldpass = request.getParameter("oldpass");
	    String newpass = request.getParameter("newpass");
	    System.out.println(id);
		boolean flag = false;
	 
		String msg = "";
		String color = "red";
		try {
			Connection con = MyDatabase.getConnection();

			String query = "select * from user_details where id = '"+id+"'";
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()){
				String p = rs.getString(4);
			if (p.equals(oldpass)){
					flag = true;
				}
			}
			if (flag) { 
		    String qry = "update user_details set password = '"+newpass+"' where id ='"+id+"' ";	
			int i = stmt.executeUpdate(qry);
			
			if(i>0){ 
				msg = "Password Change Successfully!";
		        color = "green";
		    }  
			}
			else {
				msg = "Invalid old password!";
			}
			request.setAttribute("message", msg);
			request.setAttribute("Color", color);
			RequestDispatcher rd = request.getRequestDispatcher("ChangeUserPassword.jsp");
			rd.forward(request, response);
			con.close();
		} catch (Exception e) {
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
 