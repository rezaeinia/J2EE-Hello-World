package com.arnia.web.service.soap;

import javax.xml.ws.Endpoint;

public class SoapHelloWorldPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/hello",
				new SoapHelloWorldImp());
	}

}
