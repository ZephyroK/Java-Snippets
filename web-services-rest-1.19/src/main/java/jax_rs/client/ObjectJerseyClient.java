package jax_rs.client;

import jax_rs.core.util.Order;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class ObjectJerseyClient {
	public static void main(String[] args) {
		String urlString = "http://localhost:8080/myapp/jabxresource/get";
		
		Client client = Client.create();
		WebResource resource = client.resource(urlString);
		
		Order order = resource.accept("application/xml").get(Order.class);
		System.out.println(order.getOrderId());
	}
}
