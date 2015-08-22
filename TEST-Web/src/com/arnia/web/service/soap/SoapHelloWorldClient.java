package com.arnia.web.service.soap;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class SoapHelloWorldClient {

	public static void main(String[] args) throws Exception {

		/**
		 * there are 2 way for test your web service :
		 * 1- run SoapHelloWorldPublisher and then run this main method
		 * with this url: 
		 * http://localhost:9999/ws/hello?wsdl
		 * 2- depoly ear file on application server(weblogic for example) then run this main method with this url :
		 * http://localhost:7001/test/SoapHelloWorldImpService?wsdl
		 * 
		 */

		URL url = new URL("http://localhost:9999/ws/hello?wsdl");
		QName qname = new QName("http://soap.service.web.arnia.com/",
				"SoapHelloWorldImpService");
		Service service = Service.create(url, qname);
		SoapHelloWorld hello = service.getPort(SoapHelloWorld.class);
		System.out.println(hello.getHelloWorldString(("arnia")));

	}

}