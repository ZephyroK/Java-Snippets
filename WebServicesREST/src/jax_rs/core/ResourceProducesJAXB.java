package jax_rs.core;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import jax_rs.core.util.Order;

@Path("/jabxresource")
public class ResourceProducesJAXB {
	@GET
    @Path("/get")
    @Produces("application/xml")
	private Order getOrder() {
		Order order = new Order();
		order.setOrderId(123);
		System.out.println("returning xml order");
		return order;
	}
	
	@GET
    @Path("/get")
    @Produces("application/json")
	public Order getOrderJson() {
		Order order = new Order();
		order.setOrderId(123);
		System.out.println("returning json order");
		return order;
	}
}
