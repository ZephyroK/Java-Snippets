package jax_rs.client;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class FormSubmitJerseyClient {
	public static void main(String[] args) {
		String urlString = "http://localhost:8080/myapp/formairport/add";
		
		Client client = Client.create();
		WebResource resource = client.resource(urlString);
		
		MultivaluedMap<String, String> param = new MultivaluedMapImpl();
		param.add("code", "gdl");
		param.add("name", "Guadalajara");
		
		//application/x-www-form-urlencoded
		String response = resource.type(MediaType.APPLICATION_FORM_URLENCODED_TYPE)
				.post(String.class, param);
		
		System.out.println("Response " + response);
		
	}
}
