package jax_rs.core;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/resource")
public class PathResource{
  @Path("/id") @GET
  public String getToken(){
    return "someId";
  }
}
