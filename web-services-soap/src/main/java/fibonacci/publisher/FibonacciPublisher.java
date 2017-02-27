package fibonacci.publisher;

import javax.xml.ws.Endpoint;

import fibonacci.service.Fibonacci;
import fibonacci.service.FibonacciSimple;

public class FibonacciPublisher {
	public static void main(String[] args) {
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		
		Endpoint.publish("http://127.0.0.1:6789/fibonacci", new FibonacciSimple());
	}
}
