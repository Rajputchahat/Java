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

import comDB.MyDatabase;

/**
 * Servlet implementation class DoctorLogin
 */
@WebServlet("/DoctorLogin")
public class DoctorLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		String email = request.getParameter("email");
		String pass = request.getParameter("password");

		String name = "";
		String id = ""; 
		String msg = "";
		String color = "red";
		try {
			Connection con = MyDatabase.getConnection();

			String query = "select * from doctor_details";
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();

			boolean flag = false;
			while (rs.next()) {
				String e = rs.getString(6);
				String p = rs.getString(8);

				if (e.equals(email) && p.equals(pass)) {
					id = rs.getString(1);
					name = rs.getString(2);
					flag = true;
				}
			}
			HttpSession session = request.getSession();

			if (flag) {
				session.setAttribute("doctorname", name);
				session.setAttribute("doctorid", id);
				response.sendRedirect("Doctor/Homepage.jsp");
			} else {
				msg = "Invalid email and password!";
				request.setAttribute("message", msg);
				request.setAttribute("messageColor", color);
				RequestDispatcher rd = request.getRequestDispatcher("Doctorlogin.jsp");
				rd.forward(request, response);
			}
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
