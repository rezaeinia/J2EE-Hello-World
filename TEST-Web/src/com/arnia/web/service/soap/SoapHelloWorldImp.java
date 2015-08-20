package com.arnia.web.service.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.arnia.web.service.soap.SoapHelloWorld")
public class SoapHelloWorldImp implements SoapHelloWorld {
	@Override
	@WebMethod
	public String getHelloWorldString(String name) {
		// TODO Auto-generated method stub
		return "Hello World JAX-WS " + name;
	}
}
