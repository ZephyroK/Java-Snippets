package jax_rs.core.lifecycle;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import com.sun.jersey.spi.resource.Singleton;

@Path("/singleton")
@Singleton
public class ResourceSingleton {
	private int count = 0;
	
	@Path("/resource")
	@GET
	public String get() {
		System.out.println(this);
		count++;
		return "count: " + count;
	}
}
