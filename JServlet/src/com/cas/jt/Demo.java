package com.cas.jt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo
 */
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	System.out.println("Servlet");
	// 1. Set content type
	
	response.setContentType("text/html");
	
	// 2 .Get print writer
	
	PrintWriter out = response.getWriter();
	
	// 3.Generate HTML content
	
	out.println("<HTML><Body>");
	
	out.println("<h3>Hello world Servlet</h3>");
	
	out.println("</HTML></Body>");

	}
}
