package org.tmv.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/s1",initParams = {@WebInitParam(name = "label",value = "Servlet-1")})

public class S1 extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	
	ServletContext ctx=req.getServletContext();
	
	out.write("<h1> S1:"+ctx.getInitParameter("driver")+"</h1>");
	
	ServletConfig config=getServletConfig();
	
	
	out.write("<h1> S1 Config Param:"+config.getInitParameter("label")+"</h1>");
	
	req.setAttribute("info", "secret data from S1");
	
	RequestDispatcher rd=req.getRequestDispatcher("/s2");
	
	//rd.forward(req, resp);
	
	
	RequestDispatcher rd1=req.getRequestDispatcher("/s3");
	
	rd1.include(req, resp);
	
}
}
