package jax_rs.core.params;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

public class CookieParamResource {
	@Path("resource")
	@POST
	public String get(@CookieParam("UserAgent") String userAgent,
					  @CookieParam(value="LastAccessed") String lastAccessed) {
		
		System.out.println("userAgent: " + userAgent);
		System.out.println("lastAccessed: " + lastAccessed);
	
		return "you just used cookie params";
	}
}
