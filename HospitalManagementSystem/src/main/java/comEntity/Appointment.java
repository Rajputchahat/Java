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
import java.sql.Statement;
import java.util.ArrayList;

import comDB.MyDatabase;

/**
 * Servlet implementation class Appointment
 */
@WebServlet("/appoint")
public class Appointment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Appointment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String userid = request.getParameter("userid");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		String appointdate = request.getParameter("appointdate");
		String email = request.getParameter("email");
		String phoneno = request.getParameter("phoneno");
		String diseases = request.getParameter("diseases");
		String doctorid = request.getParameter("doctorid");
		String address = request.getParameter("address");

		String msg = "";
		String color = "red";
		try {
			Connection con = MyDatabase.getConnection();
			Statement stmt = con.createStatement();
			String query = "insert into appointment(userid,name,gender,age,appointdate,email,phoneno,disease,doctorid,address,status) values ('"
					+ userid + "','" + name + "','" + gender + "','" + age + "','" + appointdate + "','" + email + "','" + phoneno
					+ "','" + diseases + "','" + doctorid + "','" + address + "','pending')";

			int i = stmt.executeUpdate(query);
			if (i > 0) {
				msg = "Booking Successfully!";
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
		RequestDispatcher rd = request.getRequestDispatcher("UserAppointment.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public ArrayList<AppointmentDetails> getappointmentDetails(String p_id) {
		ArrayList<AppointmentDetails> list = new ArrayList<AppointmentDetails>();

		try {
			Connection con = MyDatabase.getConnection();
			String qry = "Select * from appointment where userid = '"+p_id+"' ";
			PreparedStatement ps = con.prepareStatement(qry);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				AppointmentDetails ap = new AppointmentDetails();
				ap.setId(rs.getInt(1));
				ap.setName(rs.getString(3));
				ap.setGender(rs.getString(4));
				ap.setAge(rs.getString(5));
				ap.setAppointdate(rs.getString(6));
				ap.setEmail(rs.getString(7));
				ap.setPhone(rs.getString(8));
				ap.setDiseases(rs.getString(9));
				ap.setDoctorId(rs.getString(10));
				ap.setStatus(rs.getString(12));			
				list.add(ap);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
	
	public ArrayList<AppointmentDetails> appointmentDetails(String id) {
		ArrayList<AppointmentDetails> list = new ArrayList<AppointmentDetails>();
		try {
			Connection con = MyDatabase.getConnection();
			String qry = "Select * from appointment where doctorid ='"+id+"'";
			PreparedStatement ps = con.prepareStatement(qry);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				AppointmentDetails ap = new AppointmentDetails();
				ap.setId(rs.getInt(1));
				ap.setName(rs.getString(3));
				ap.setGender(rs.getString(4));
				ap.setAge(rs.getString(5));
				ap.setAppointdate(rs.getString(6));
				ap.setEmail(rs.getString(7));
				ap.setPhone(rs.getString(8));
				ap.setDiseases(rs.getString(9));
				ap.setDoctorId(rs.getString(10));
				ap.setStatus(rs.getString(12));			
				list.add(ap);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
	
	public AppointmentDetails getDetails(String id) {
		AppointmentDetails ap = new AppointmentDetails();
		try {
			Connection con = MyDatabase.getConnection();
			String qry = "Select * from appointment where id ='"+id+"'";
			PreparedStatement ps = con.prepareStatement(qry);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ap.setId(rs.getInt(1));
				ap.setName(rs.getString(3));
				ap.setGender(rs.getString(4));
				ap.setAge(rs.getString(5));
				ap.setAppointdate(rs.getString(6));
				ap.setEmail(rs.getString(7));
				ap.setPhone(rs.getString(8));
				ap.setDiseases(rs.getString(9));
				ap.setDoctorId(rs.getString(10));
				ap.setStatus(rs.getString(12));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return ap;
	}
	
	public ArrayList<AppointmentDetails> getAllAppointment() {
		ArrayList<AppointmentDetails> list = new ArrayList<AppointmentDetails>();

		try {
			Connection con = MyDatabase.getConnection();
			String qry = "Select * from appointment order by id desc";
			PreparedStatement ps = con.prepareStatement(qry);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				AppointmentDetails ap = new AppointmentDetails();
				ap.setId(rs.getInt(1));
				ap.setName(rs.getString(3));
				ap.setGender(rs.getString(4));
				ap.setAge(rs.getString(5));
				ap.setAppointdate(rs.getString(6));
				ap.setEmail(rs.getString(7));
				ap.setPhone(rs.getString(8));
				ap.setDiseases(rs.getString(9));
				ap.setDoctorId(rs.getString(10));
				ap.setAddress(rs.getString(11));;
				ap.setStatus(rs.getString(12));			
				list.add(ap);
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
}
