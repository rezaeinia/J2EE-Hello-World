package com.arnia.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// refer to web.xml this servlet
public class DefaultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public DefaultServlet() {
	}

	String globalVariable = "Guest";

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out = response.getWriter();
			out.println("<H1>JSP/Servlet Example</H1><BR>");
			out.println("Hello " + globalVariable);
			out.flush();
			out.close();
		} catch (Exception e) {
			PrintWriter out = response.getWriter();
			out.println("Error");
			out.flush();
			out.close();
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		if (userName != null && !userName.isEmpty())
			globalVariable = userName;
		doGet(request, response);
	}
}
