package org.tmv.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/user")
public class MyFormHandlerServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String username=req.getParameter("username");
		String loc=req.getParameter("location");
		
		out.write("<h1> "+username+" : "+loc+"</h1>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String username=req.getParameter("username");
		String loc=req.getParameter("location");
		
		out.write("<h1> "+username+" : "+loc+"</h1>");
	}
	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init is executed....");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy is executed....");
	}
}
