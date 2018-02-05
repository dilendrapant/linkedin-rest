package com.dilendra.linkedin_rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("people")
public class PeopleResource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public People getPeople() {

		People a = new People();
		a.setId(1);
		a.setName("Dilendra");
		a.setUrl("www.linkedin.com/in/dilendra");
		return a;
	}
}
