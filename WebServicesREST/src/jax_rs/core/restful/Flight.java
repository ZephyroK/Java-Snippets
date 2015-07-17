package jax_rs.core.restful;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Flight {
	private int number;
	private String from;
	private String to;
	private int passengers;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getPassengers() {
		return passengers;
	}
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
}
