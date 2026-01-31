package comEntity;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import comDB.MyDatabase;
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
 * Servlet implementation class Userlogin
 */
@WebServlet("/forward")
public class Userlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Userlogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String email = request.getParameter("email");
		String pass = request.getParameter("password");

		String id = "";
		String name = "";
		String msg = "";
		String color = "red";
		try {
			Connection con = MyDatabase.getConnection();

			String query = "select * from user_details";
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();

			boolean flag = false;
			while (rs.next()) {
				String e = rs.getString(3);
				String p = rs.getString(4);

				if (e.equals(email) && p.equals(pass)) {
					id = rs.getString(1);
					name = rs.getString(2);
					flag = true;
				}
			}
			HttpSession session = request.getSession();

			if (flag) {
				session.setAttribute("username", name);
				session.setAttribute("id", id);
				response.sendRedirect("Index.jsp");
//				response.sendRedirect("UserAppoinment.jsp");
			} else {
				msg = "Invalid email and password!";
				request.setAttribute("message", msg);
				request.setAttribute("messageColor", color);
				RequestDispatcher rd = request.getRequestDispatcher("Userlogin.jsp");
				rd.forward(request, response);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
