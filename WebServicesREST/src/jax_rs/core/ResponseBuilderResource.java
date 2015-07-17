package jax_rs.core;

import java.net.URI;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import com.sun.jersey.spi.resource.Singleton;

import jax_rs.core.util.Airport;

@Path("/airportsrest")
public class ResponseBuilderResource {
	@Context UriInfo uriInfo;
	private Airport airport;
	
	@POST
	@Path("/add")
	public Response addAirport(@FormParam("code") String code,
							   @FormParam("name") String name) {
		airport = new Airport();
		airport.setCode(code);
		airport.setName(name);
		
		UriBuilder uriBuilder = uriInfo.getBaseUriBuilder();
		URI uri = uriBuilder
					.path(ResponseBuilderResource.class)
					.path(ResponseBuilderResource.class, "getAirport").build(code);
		
		return Response.created(uri).build();
	}
	
	@GET
	@Path("/get/{code}")
	public Airport getAirport(@PathParam("code") String code) {
		
		if(airport != null && code != null) {
			if(code.equals(airport.getCode())) {
				return airport;
			}
		}
		
		return new Airport();
	}
}
