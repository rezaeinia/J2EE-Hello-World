package com.arnia.web.service.soap;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class SoapHelloWorldClient {

	public static void main(String[] args) throws Exception {

		/**
		 * according to wsdl that can be found in http://localhost:9999/ws/hello?wsdl
		 */
		URL url = new URL("http://localhost:9999/ws/hello?wsdl");
		QName qname = new QName("http://soap.service.web.arnia.com/",
				"SoapHelloWorldImpService");
		Service service = Service.create(url, qname);
		SoapHelloWorld hello = service.getPort(SoapHelloWorld.class);
		System.out.println(hello.getHelloWorldString(("arnia")));

	}

}