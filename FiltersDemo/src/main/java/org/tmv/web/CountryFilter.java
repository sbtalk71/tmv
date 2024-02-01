package org.tmv.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter("/*")
public class CountryFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String country = request.getParameter("country");
		if (country != null) {
			if (country.equalsIgnoreCase("india")) {
				chain.doFilter(request, response);
			} else {
				response.getWriter().write("<h1>Only India is allowed</h1>");
			}
		}else {
			response.getWriter().write("<h1>Missing Country Parameter</h1>");
		}
	}

}
