package provider.payload.source.publisher;

import javax.xml.ws.Endpoint;

import provider.payload.source.service.MessagingServer;

public class MessagingServerPublisher {
	public static void main(String[] args) throws Exception {
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		
        String url = "http://127.0.0.1:8089/Messaging";
        Endpoint.publish(url, new MessagingServer());
    }
}
