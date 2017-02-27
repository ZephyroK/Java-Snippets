package jax_rs.core.restful;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Airport {
	private String code;
	private String name;
	private List<FlightSummary> flights;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<FlightSummary> getFlights() {
		return flights;
	}

	public void setFlights(List<FlightSummary> flights) {
		this.flights = flights;
	}
}
