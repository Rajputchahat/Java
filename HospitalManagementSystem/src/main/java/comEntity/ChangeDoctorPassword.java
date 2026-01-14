package comEntity;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import comDB.MyDatabase;

/**
 * Servlet implementation class ChangeDoctorPassword
 */
@WebServlet("/CDP")
public class ChangeDoctorPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeDoctorPassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	    String id = request.getParameter("d_id");
	    String oldpass = request.getParameter("oldpass");
	    String newpass = request.getParameter("newpass");
	    System.out.println(id);
		boolean flag = false;
	 
		String msg = "";
		String color = "red";
		try {
			Connection con = MyDatabase.getConnection();

			String query = "select * from doctor_details where id = '"+id+"'";
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				String p = rs.getString(8);
			if (p.equals(oldpass)){
					flag = true;
				}
			}
			if (flag) { 
		    String qry = "update doctor_details set password = '"+newpass+"' where id ='"+id+"' ";	
			int i = stmt.executeUpdate(qry);
			
			if(i>0){ 
				msg = "Password Change Successfully!";
		        color = "green";
		    }
			}
		    else{
				msg = "Invalid old password!";
			}
			request.setAttribute("message", msg);
			request.setAttribute("Color", color);
			RequestDispatcher rd = request.getRequestDispatcher("Doctor/ChangeDoctorPassword.jsp");
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
