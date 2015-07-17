package jax_rs.core.subresource;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import jax_rs.core.restful.Airport;
import jax_rs.core.restful.AirportSummary;
import jax_rs.core.restful.FlightSummary;

@Path("/airportsresource")
public class AirportResource {
	@Context UriInfo uriInfo;
	
	@GET
	public List<AirportSummary> getAirportsContainer() {
		List<AirportSummary> airportsList = new ArrayList<AirportSummary>();
		
		for(int i = 0; i < 5; i++){
			AirportSummary airportSummary = new AirportSummary();
			airportSummary.setCode(String.valueOf(i));
			
			UriBuilder uriBuilder = uriInfo.getBaseUriBuilder();
			URI uri = uriBuilder
							.path(AirportResource.class)
							.path(AirportResource.class, "getAirport")
							.build(i);
			airportSummary.setRef(uri.toString());
			airportsList.add(airportSummary);
		}
		
		return airportsList;
	}
	
	@GET
	@Path("{code}")
	public Airport getAirport(@PathParam("code") String code) {
		Airport airport = new Airport();
		airport.setCode(code);
		airport.setName("random name");
		
		List<FlightSummary> flightList = new ArrayList<FlightSummary>();
		for(int i = 0;i < 5; i++){
			FlightSummary flightSummary = new FlightSummary();
			flightSummary.setNumber(i);
			
			UriBuilder uriBuilder = uriInfo.getBaseUriBuilder();
			URI uri = uriBuilder
							.path(AirportResource.class)
							.path(AirportResource.class, "getFlight")
							.build(i);
			
			flightSummary.setRef(uri.toString());
			flightList.add(flightSummary);
		}
		
		airport.setFlights(flightList);
		return airport;
	}
	
	@Path("/flight/{number}")
	public FlightSubResource getFlight(@PathParam("number") int number) {
		System.out.println("returning FlightSubResource");
		return new FlightSubResource(number);
	}
}
