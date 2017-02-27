package jax_rs.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class QueryParamJerseyClient {
	public static void main(String[] args) {
		String contextURL = "http://localhost:8080/myapp";
		String resourcePath = "/employees";
		String urlString = contextURL + resourcePath;
		
		Client client = Client.create();
		WebResource resource = client.resource(urlString);
		
		String response = resource
				.queryParam("start", "0")
				.queryParam("size", "10")
				.get(String.class);
		
		System.out.println("response: " + response);
	}
}
