package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("this is second Servlet of genericServlet...");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1> hello guys !!! this is generaic Servlet");
		out.println("<h1><a href='/Ztest'>Back Home</a></h1>");
	}

}
