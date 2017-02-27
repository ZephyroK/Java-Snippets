package jax_rs.core.params;

import java.net.URI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;


@Path("airportspath")
public class PathParamAirport {
	@Context UriInfo uriInfo;
	
	@Path("nameByCode/{code}")
	public String getNameByCode(@PathParam("code") String code) {
		System.out.println("nameByCode: " + code);
		
		URI absolute = uriInfo.getAbsolutePath();
		URI base = uriInfo.getBaseUri();
		URI request = uriInfo.getRequestUri();
		
		System.out.println("absolute: " + absolute);
		System.out.println("base: " + base);
		System.out.println("request: " + request);
		
		if("123".equals(code)) {
			return "Guadalajara Airport";
		}
		else {
			return "Code not found";
		}
	}
}



















//@Context UriInfo uriInfo;
//
//URI absolute = uriInfo.getAbsolutePath();
//URI base = uriInfo.getBaseUri();
//URI request = uriInfo.getRequestUri();
//
//System.out.println("absolute: " + absolute);
//System.out.println("base: " + base);
//System.out.println("request: " + request);