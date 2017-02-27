package jax_rs.core;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/typedresource")
@Produces("text/plain")
public class ResourceProduces {
	@GET
	public String doGetAsPlainText() {
		return "Plain Text returned";
	}
	 
	@GET
	@Produces("text/html")
	public String doGetAsHtml() {
	    StringBuilder stringBuilder = new StringBuilder();
	    stringBuilder.append("<html>");
	    stringBuilder.append("<body>");
	    stringBuilder.append("<h1>HTML returned</h1>");
	    stringBuilder.append("</body>");
	    stringBuilder.append("</html>");
	    
	    return stringBuilder.toString();
	}
}
