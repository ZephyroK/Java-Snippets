package jax_rs.core.params;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;

@Path("header")
public class HeaderParamResource {
	@Path("read")
	@GET
	public String readHeader(@HeaderParam("Referer") String referer) {
		System.out.println( "Header Referer: " + referer);
		return "Header Referer: " + referer;
	}
}
