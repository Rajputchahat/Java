package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/Go")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		try
        {
        	response.setContentType("text/html");   
        	
        	String name = request.getParameter("name");
        	
        	pw.println("Welcome To Ainwik Mr. "+name);
        	
        	//For save the request and response in Cookies object
        
        	
        	Cookie co = new Cookie("name_key",name);
        	
        	response.addCookie(co);
        
        	//Dynamically design UI
        	pw.print("<html><body>");
        	pw.print("<form action = 'Run'>");
        	pw.print("<input type = 'submit' value='Click Here'/>");
        	pw.print("</form>");
        	pw.print("</body></html>");
        }
		catch(Exception e)
        {
			pw.print(e);
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
