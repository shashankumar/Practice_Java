package com.sk.RestServicesOne;

import java.util.Arrays;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/rest")
public class Test {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Object> hello() {
		return Arrays.asList(1,Arrays.asList(1,2,3,4),3,45);
	}

}
