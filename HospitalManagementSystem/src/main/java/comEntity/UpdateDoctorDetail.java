 package comEntity;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import comDB.MyDatabase;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddDoctor
 */
@WebServlet("/update_doctor")
public class UpdateDoctorDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateDoctorDetail() {
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
        
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String dob = request.getParameter("dob");
		String qli = request.getParameter("edu");
		String sp = request.getParameter("pro");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobno");
		String pass = request.getParameter("password");

		String msg = "";
		String color = "red";
		try {
			Connection con = MyDatabase.getConnection();
			Statement stmt = con.createStatement();
			String query = "UPDATE doctor_details SET name='"+name+"',dob='"+dob+"',qualification='"+qli+"',specialist='"+sp+"',"
					+ "email='"+email+"',mobile='"+mobile+"',password='"+pass+"' WHERE id = '"+id+"'";

			int i = stmt.executeUpdate(query);
			if (i > 0) {
				msg = "Doctor Detail Update Successfully!";
				color = "Orange";

			} else {
				msg = "Some Error Occur!";
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		request.setAttribute("msg", msg);
		request.setAttribute("color", color);
		RequestDispatcher rd = request.getRequestDispatcher("Admin/EditDoctorDetail.jsp");
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
		public DoctorDetails getDoctorById(int a) {
			DoctorDetails dd = new DoctorDetails();
			try {
				Connection con = MyDatabase.getConnection();
				String qry = "Select * from doctor_details where id = '" + a + "' ";
				PreparedStatement ps = con.prepareStatement(qry);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					dd.setId(rs.getInt(1));
					dd.setName(rs.getString(2));
					dd.setDob(rs.getString(3));
					dd.setQli(rs.getString(4));
					dd.setSpc(rs.getString(5));
					dd.setEmail(rs.getString(6));
					dd.setMobile(rs.getString(7));
					dd.setPass(rs.getString(8));
				}
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			return dd;
		}
	}
