package jax_rs.core.exception;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/elementscustom")
public class ElementsCustomResource {
	private String[] elements;
	
	public ElementsCustomResource() {
		elements = new String[5];
		elements[0] = "Element 1";
		elements[1] = "Element 2";
		elements[2] = "Element 3";
		elements[3] = "Element 4";
		elements[4] = "Element 5";
	} 
	
	@GET
	@Path("{index}")
	public String getElementAt(@PathParam("index") int index) {
		if(index > elements.length) {
			throw new CustomNotFoundException("Element not exists at " + index);
		}
		return elements[index];
	}
}
