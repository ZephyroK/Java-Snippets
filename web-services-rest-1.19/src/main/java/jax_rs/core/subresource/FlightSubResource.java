package jax_rs.core.subresource;

import javax.ws.rs.GET;

import jax_rs.core.restful.Flight;
	
public class FlightSubResource {
	
	private int number;
	
	public FlightSubResource(int number) {
		this.number = number;
	}
	
	@GET
	public Flight getFlight() {
		System.out.println("inside FlightSubResource.getFlight");
		Flight flight = new Flight();
		flight.setNumber(number);
		flight.setFrom("origen");
		flight.setTo("destino");
		flight.setPassengers(50);
		
		return flight;
	}
}
