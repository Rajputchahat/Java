package com;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
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
 * Servlet implementation class SecondServlet
 */
@WebServlet("/go")
public class SecondServlet implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException 
	{
	    String n = arg0.getParameter("name");
	    String f = arg0.getParameter("fname");
	    String d = arg0.getParameter("dob");
	    String a = arg0.getParameter("address");
	    String p = arg0.getParameter("phone");
	    
	    
	    PrintWriter out = arg1.getWriter();
	    
	    out.print("My name is "+n);
	    out.print("\n");
	    out.print("My Father name is "+f); 
	    out.print("\n");
	    out.print("I was born on "+d);
	    out.print("\n");
	    out.print("I live in "+a);
	    out.print("\n");
	    out.print("MY contact number is "+p);
	    
	    
	    
	   
	}
	


}

