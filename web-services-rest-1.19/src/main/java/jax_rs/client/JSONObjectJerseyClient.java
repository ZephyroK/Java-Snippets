package jax_rs.client;

import javax.ws.rs.core.MediaType;

import jax_rs.core.util.Order;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class JSONObjectJerseyClient {
	public static void main(String[] args) {
		String urlResource = "http://localhost:8080/myapp/jabxresource/get";
		
		Client client = Client.create();
		WebResource resource = client.resource(urlResource);
		
		Order order = resource.accept(MediaType.APPLICATION_JSON_TYPE)
							   .get(Order.class);
		
		System.out.println("Order id: " + order.getOrderId());
		
	}
}
