package jax_rs.core.restful;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

@Path("/airportsrestful")
public class AirportsRestful {

	@Context UriInfo uriInfo;
	@GET
	public List<AirportSummary> getAirportsContainer() {
		List<AirportSummary> airportsList = new ArrayList<AirportSummary>();
		
		for(int i = 0; i < 5; i++){
			AirportSummary airportSummary = new AirportSummary();
			airportSummary.setCode(String.valueOf(i));
			
			UriBuilder uriBuilder = uriInfo.getBaseUriBuilder();
			URI uri = uriBuilder
							.path(AirportsRestful.class)
							.path(AirportsRestful.class, "getAirport")
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
							.path(AirportsRestful.class)
							.path(AirportsRestful.class, "getFlight")
							.build(i);
			
			flightSummary.setRef(uri.toString());
			flightList.add(flightSummary);
		}
		
		airport.setFlights(flightList);
		return airport;
	}
	
	@GET
	@Path("/flight/{number}")
	public Flight getFlight(@PathParam("number") int number) {
		Flight flight = new Flight();
		flight.setNumber(number);
		flight.setFrom("origen");
		flight.setTo("destino");
		flight.setPassengers(50);
		
		return flight;
	}
}
