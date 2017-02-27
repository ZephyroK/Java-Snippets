package inheritance.service.publisher;

import inheritance.service.CatalogWS;
import inheritance.service.Child;

import javax.xml.ws.Endpoint;

public class ChildPublisher {
	public static void main(String[] args) {
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		
		Endpoint.publish("http://127.0.0.1:2345/child", new CatalogWS());
	}
}
