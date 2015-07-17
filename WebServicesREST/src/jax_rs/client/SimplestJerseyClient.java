package jax_rs.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.LoggingFilter;

public class SimplestJerseyClient {
	static public void main( String[] args ) {
		System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
		System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
		
		String contextURL = "http://localhost:8080/myapp";
		String resourcePath = "/jabxresource";
		String requestPath = "/get";
		String urlString = contextURL + resourcePath + requestPath;
	
		Client client = Client.create();
		client.addFilter(new LoggingFilter());
		WebResource resource = client.resource(urlString);
		String result = resource.header("customheader", "value").get(String.class);
	
		System.out.println( "Result: " + result );
	}
}
