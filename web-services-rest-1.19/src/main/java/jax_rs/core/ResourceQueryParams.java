package jax_rs.core;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("queryparam")
public class ResourceQueryParams {
	
	@GET
    @Produces(MediaType.TEXT_PLAIN)
	public String readParams(@QueryParam("queryparam1") String param1,
													 @QueryParam("queryparam2") String param2,
													 @QueryParam("queryparam3") String param3) {
		System.out.println("queryparam1: " + param1);
		System.out.println("queryparam2:" + param2);
		System.out.println("queryparam3" + param3);
		
		return param1 + " " + param2 + " " + param3;
	}
}
