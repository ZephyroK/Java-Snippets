package style.document.bare.service.publisher;

import javax.xml.ws.Endpoint;

import style.document.bare.service.AwesomeServiceBareDocument;

public class AwesomeServiceBareDocumentPublisher {
	public static void main(String[] args) {
		//1st Argument, the publication URL
		//2nd Argument, the SIB instance
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		
		Endpoint.publish("http://127.0.0.1:8765/bare", new AwesomeServiceBareDocument());
	}
}
