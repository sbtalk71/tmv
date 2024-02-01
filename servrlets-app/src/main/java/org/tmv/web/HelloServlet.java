package org.tmv.web;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends GenericServlet {

	public void service(ServletRequest req, ServletResponse resp) throws ServletException,IOException{
		
		resp.setContentType("text/html");
		
		PrintWriter out=resp.getWriter();
		
		
		
		out.write("<h1>Hello There</h1>");
		out.write("<h1>Thread: "+Thread.currentThread().getName()+"</h1>");
		
	}
	
}
