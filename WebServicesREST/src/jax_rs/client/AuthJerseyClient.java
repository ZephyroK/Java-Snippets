package jax_rs.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.ClientFilter;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.api.client.filter.LoggingFilter;

public class AuthJerseyClient {
	public static void main(String[] arg) {
		String urlResource = "http://localhost:8080/jerseyWeb/resources/creditcards";
		
		Client client = Client.create();
		client.addFilter(new LoggingFilter());
		ClientFilter authFilter = new HTTPBasicAuthFilter("kelly", "123");
		client.addFilter(authFilter);
		WebResource resource = client.resource(urlResource);
		
		String response = resource.get(String.class);
		System.out.println("response: " + response);
	}
}






























