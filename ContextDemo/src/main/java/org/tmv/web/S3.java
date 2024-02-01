package org.tmv.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s3")
public class S3 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	
	ServletContext ctx=req.getServletContext();
	
	out.write("<h1> S3: "+ctx.getInitParameter("driver")+"</h1>");
	out.write("<h1> S3 Request Data: "+req.getAttribute("info")+"</h1>");
}
}
