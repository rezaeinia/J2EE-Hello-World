package com.arnia.web.service.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import com.google.gson.Gson;

@Path("")
public class UserRestServices {
	@Path("helloWorld/{userName}")
	@GET
	public String getHelloWorldString(@PathParam("userName") String userName) {
		return "Hello " + userName;
	}

	@Path("session/statefull/{string}")
	@GET
	@Produces("application/json; charset=utf-8")
	public String setUserNameFromStateFullBean(
			@PathParam("string") String userName,
			@Context HttpServletRequest request) {
		saveUserNameInSession(userName, request);
		Accessor.getStateFullBean().setUserName(userName);
		return "done";

	}

	private void saveUserNameInSession(String userName,
			HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("UserName", userName);
	}

	private String getUserNameFromSession(HttpServletRequest request) {
		HttpSession session = request.getSession();

		return (String) session.getAttribute("UserName");
	}

	@Path("session/statefull")
	@GET
	@Produces("application/json; charset=utf-8")
	public String getUserNameFromStateFullBean(
			@Context HttpServletRequest request) {
		String beanUserName = Accessor.getStateFullBean().getUserName();
		return "your web-session? userName : "
				+ getUserNameFromSession(request) + "\nyour bean userName: "
				+ beanUserName;
	}

	@Path("session/stateless/{string}")
	@GET
	@Produces("application/json; charset=utf-8")
	public String setUserNameFromStatelessBean(
			@PathParam("string") String userName,
			@Context HttpServletRequest request) {
		saveUserNameInSession(userName, request);
		Accessor.getStatelessBean().setUserName(userName);
		return "done";
	}

	@Path("session/stateless")
	@GET
	@Produces("application/json; charset=utf-8")
	public String getUserNameFromStatelessBean(
			@Context HttpServletRequest request) {

		String beanUserName = Accessor.getStatelessBean().getUserName();
		return "your web-session? userName : "
				+ getUserNameFromSession(request) + "\nyour bean userName: "
				+ beanUserName;
	}

	@Path("session/singleton/{string}")
	@GET
	@Produces("application/json; charset=utf-8")
	public String setUserNameFromSingletonBean(
			@PathParam("string") String userName,
			@Context HttpServletRequest request) {
		saveUserNameInSession(userName, request);
		Accessor.getSingletonBean().setUserName(userName);
		return "done";

	}

	@Path("session/singleton")
	@GET
	@Produces("application/json; charset=utf-8")
	public String getUserNameFromSingletonBean(@PathParam("string") String s,
			@Context HttpServletRequest request) {
		String beanUserName = Accessor.getSingletonBean().getUserName();
		return "your web-session? userName : "
				+ getUserNameFromSession(request) + "\nyour bean userName: "
				+ beanUserName;

	}

}
