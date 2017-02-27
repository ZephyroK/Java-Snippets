package jax_rs.client;

import jax_rs.core.util.Order;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.LoggingFilter;

public class ClientResponseJerseyClient {
	public static void main(String[] args) {
		String urlString = "http://localhost:8080/myapp/jabxresource/get";
		
		Client client = Client.create();
		client.addFilter(new LoggingFilter());
		WebResource resource = client.resource(urlString);
		
		ClientResponse response = resource.accept("application/json").
					get(ClientResponse.class);
		
		int status = response.getStatus();
		System.out.println("status: " + status);
		
		Order order = response.getEntity(Order.class);
		System.out.println("Order id: " + order.getOrderId());
		
	}
}
