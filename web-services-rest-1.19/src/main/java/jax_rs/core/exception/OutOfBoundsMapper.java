package jax_rs.core.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class OutOfBoundsMapper implements ExceptionMapper<ArrayIndexOutOfBoundsException> {

	@Override
	public Response toResponse(ArrayIndexOutOfBoundsException exception) {
		System.out.println("inside OutOfBoundsMapper.toResponse");
		return Response.status(Status.BAD_REQUEST).build();
	}

}
