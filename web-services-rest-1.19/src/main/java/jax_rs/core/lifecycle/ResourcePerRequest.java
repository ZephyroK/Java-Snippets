package jax_rs.core.lifecycle;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/request")
public class ResourcePerRequest {
	private int count = 0;
	
	@Path("/resource")
	@GET
	public String get() {
		System.out.println(this);
		count++;
		return "count: " + count;
	}
}
