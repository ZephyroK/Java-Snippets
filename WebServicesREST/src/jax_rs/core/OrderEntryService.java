package jax_rs.core;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import jax_rs.core.util.Order;

@Path("/orders")
public class OrderEntryService {
	@GET
	@Path("{id}")
	@Produces({"application/xml", "application/json"})
	public Response getOrder(
				@PathParam("id") int orderId) {
			Order order = new Order(orderId);
			ResponseBuilder builder = Response.ok(order);
			Date expirationDate = new Date(System.currentTimeMillis() + 3000);
			builder.expires(expirationDate);
			return builder.build();
	}
}

