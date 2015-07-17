package customized.service.publisher;

import javax.xml.ws.Endpoint;
import customized.service.CustomService;

public class CustomServicePublisher {
	public static void main(String ...args) {
		//1st Argument, the publication URL
		//2nd Argument, the SIB instance
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		
		Endpoint.publish("http://127.0.0.1:3456/customService", new CustomService());
	}
}
