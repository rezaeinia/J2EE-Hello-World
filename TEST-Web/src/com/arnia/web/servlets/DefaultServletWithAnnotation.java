package com.arnia.web.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (urlPatterns="jsp/servlet-with-annotation")
public class DefaultServletWithAnnotation extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DefaultServlet defaultServlet = new DefaultServlet();
		defaultServlet.doGet(request, response);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		DefaultServlet defaultServlet = new DefaultServlet();
		defaultServlet.doPost(request, response);
	}
	
	
}
