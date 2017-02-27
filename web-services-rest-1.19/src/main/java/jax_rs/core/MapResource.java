package jax_rs.core;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("mapresource")
public class MapResource {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Map<String, String> getMap() {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("key_1", "value_1");
		map.put("key_2", "value_2");
		map.put("key_3", "value_3");
		map.put("key_4", "value_4");
		map.put("key_5", "value_5");
		
		return map;
	}
}
