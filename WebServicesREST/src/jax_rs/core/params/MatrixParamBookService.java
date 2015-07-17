package jax_rs.core.params;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/books")
public class MatrixParamBookService {
	@Path("{year}")
	@POST
	public String getBooks(
			@PathParam("year") String year,
			@MatrixParam("author") String author,
			@MatrixParam("country") String country) {
	
		return "year: " + year + " author: " + author + " country: " + country;
	}
}
