package jax_rs.client;

import java.util.Map;

import jax_rs.core.util.MapMessageBodyReader;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class MapJerseyClient {
	static public void main( String[] args ) {
		String contextURL = "http://localhost:8080/myapp";
		String resourcePath = "/mapresource";
		String urlString = contextURL + resourcePath;
	
		ClientConfig cc = new DefaultClientConfig();
	    cc.getClasses().add(MapMessageBodyReader.class);
		Client client = Client.create(cc);
		
		//Client client = Client.create();
		WebResource resource = client.resource(urlString);
		Map<String, String> result = resource.get(Map.class);
	
		System.out.println( "Result: " + result );
	}
}
