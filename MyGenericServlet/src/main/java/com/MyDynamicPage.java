package com;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyDynamicPage
 */
@WebServlet("/go")
public class MyDynamicPage extends GenericServlet
{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		PrintWriter out = arg1.getWriter();
		arg1.setContentType("text/html");
		out.print("<html>");
		out.print("<body bgcolor = CYAN>");
		out.print("Welcome to Generic Servlet");
		out.print("</body>");
		out.print("</html>");
		
	}


}
