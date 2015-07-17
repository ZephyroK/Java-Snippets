package oneway.service.publisher;

import javax.xml.ws.Endpoint;
import oneway.service.OneWayService;

public class OneWayServicePublisher {
	public static void main(String[] args) {
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		
		Endpoint.publish("http://127.0.0.1:1234/oneway", new OneWayService());
	}
}
