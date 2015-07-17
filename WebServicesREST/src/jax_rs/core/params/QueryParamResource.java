package jax_rs.core.params;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

@Path("/")
public class QueryParamResource {
	@Context UriInfo uriInfo;
	
	@Path("/employees")
	@GET
	public String getEmployees(
			@QueryParam("start") int start,
			@QueryParam("size") int size) 
	{
		System.out.println("start: " + start);
		System.out.println("size: " + size);
		
		return "employee from index " + start + ", length: " + size;
	}
}













//URI absolute = uriInfo.getAbsolutePath();
//URI base = uriInfo.getBaseUri();
//URI request = uriInfo.getRequestUri();
//
//System.out.println("absolute: " + absolute);
//System.out.println("base: " + base);
//System.out.println("request: " + request);