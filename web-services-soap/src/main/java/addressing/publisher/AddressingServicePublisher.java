package addressing.publisher;

import javax.xml.ws.Endpoint;
import javax.xml.ws.soap.AddressingFeature;

import addressing.service.WsAddressing;

public class AddressingServicePublisher {
	public static void main(String[] args) {
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		
		Endpoint.publish("http://127.0.0.1:7890/addressing", new WsAddressing()/* , new AddressingFeature(true, true)*/);
	}
}
