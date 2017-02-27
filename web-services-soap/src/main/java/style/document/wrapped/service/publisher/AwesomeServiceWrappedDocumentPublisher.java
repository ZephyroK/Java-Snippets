package style.document.wrapped.service.publisher;

import javax.xml.ws.Endpoint;

import style.document.wrapped.service.AwesomeServiceWrappedDocument;

public class AwesomeServiceWrappedDocumentPublisher {
	public static void main(String[] args) {
		//1st Argument, the publication URL
		//2nd Argument, the SIB instance
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		
		Endpoint.publish("http://localhost:7890/wrapped", new AwesomeServiceWrappedDocument());
	}
}
