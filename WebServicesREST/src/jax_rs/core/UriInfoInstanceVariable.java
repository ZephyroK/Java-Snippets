package jax_rs.core;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.UriInfo;

@Path("/uriinfoinstace")
public class UriInfoInstanceVariable {
	
	@Context UriInfo uriInfo;
	
	@GET
	@Path("/resource")
	public String getResource() {
		// Client used this URI to reach this resource method
		String uri = uriInfo.getAbsolutePath().toASCIIString();
		List<PathSegment> list = uriInfo.getPathSegments();
		for(PathSegment path : list) {
			System.out.println("path segment: " + path.getPath());
		}
		System.out.println("uri: " + uri);
		return uriInfo.getAbsolutePath().toASCIIString();
	}
}
