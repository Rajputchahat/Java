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
 * Servlet implementation class Comment
 */
@WebServlet("/Comment")
public class Comment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Comment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	           
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String comment = request.getParameter("comment");
		String a = request.getParameter("a_id");
		String b = request.getParameter("d_id");
		
		String msg = "";
		String color = "red";
		try {
			Connection con = MyDatabase.getConnection();
			Statement stmt = con.createStatement();
			String query = "UPDATE appointment SET status='"+comment+"' WHERE id = '"+a+"' AND doctorid = '"+b+"' ";

			int i = stmt.executeUpdate(query);
			if (i > 0) {
				msg = "Patient Status Update Successfully!";
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
		RequestDispatcher rd = request.getRequestDispatcher("Doctor/Comment.jsp");
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
