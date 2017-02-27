package jax_rs.core.params;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("formairport")
public class FormParamAirport {
	@Path("add")
	@POST
	public String addAirport(@FormParam("code") String code, 
							 @FormParam("name") String name) {
		System.out.println("code:" + code);
		System.out.println("name: " + name);
		return "Adding airport, code: " + code + ", name: " + name;
	}
}
