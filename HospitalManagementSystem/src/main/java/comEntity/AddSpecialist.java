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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import comDB.MyDatabase;

/**
 * Servlet implementation class AddSpecialist
 */
@WebServlet("/AddSpecialist")
public class AddSpecialist extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddSpecialist() {
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

		String name = request.getParameter("name");
		String msg = "";
		String color = "red";

		try {
			Connection con = MyDatabase.getConnection();
			Statement stmt = con.createStatement();
			String query = "insert into specialist(name) values ('" + name + "')";

			int i = stmt.executeUpdate(query);
			if (i > 0) {
				msg = "Specialist Added Successfully";
				color = "Purple";
			} else {
				msg = "Some Error Occur.";
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		request.setAttribute("msg", msg);
		request.setAttribute("color", color);
		RequestDispatcher rd = request.getRequestDispatcher("Admin/Homepage.jsp");
		rd.forward(request, response);

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

	public ArrayList getAllSpecialist() {
		ArrayList list = new ArrayList();
		String spc = "";
		try {
			Connection con = MyDatabase.getConnection();

			String qry = "Select * from specialist";
			PreparedStatement ps = con.prepareStatement(qry);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				spc = rs.getString(2);
				list.add(spc);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
}
