package jax_rs.core;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/airports")
public class Airport {
	
	@GET
	@Path("/numAirports")
	public String getNumAirports() {
		return "10";
	}
}
