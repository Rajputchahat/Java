package comEntity;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import comDB.MyDatabase;

/**
 * Servlet implementation class DeleteDoctor
 */
@WebServlet("/delete_doctor")
public class DeleteDoctor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteDoctor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int a = Integer.parseInt(request.getParameter("id"));
		String msg = "";
		String color = "red";
		try 
		{
			Connection con = MyDatabase.getConnection();
			Statement stmt = con.createStatement();
			
			String query = "Delete from doctor_details where id = '"+a+"' ";

			int i = stmt.executeUpdate(query);
			if (i > 0) {
				msg = "Doctor Delete Successfully!";
				color = "Pink";

			} else {
				msg = "Some Error Occur!";
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		request.setAttribute("msg", msg);
		request.setAttribute("color", color);
		RequestDispatcher rd = request.getRequestDispatcher("Admin/ViewDoctor.jsp");
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
