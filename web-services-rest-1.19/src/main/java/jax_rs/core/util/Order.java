package jax_rs.core.util;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Order {
	private int orderId;
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Order() {
		orderId = 0;
	}
	
	public Order(int id) {
		orderId = id;
	}
}
