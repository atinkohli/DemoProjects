package com.kohlisoft.rest.webservice;

import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/SimpleService")
public class HelloWorldResource {

	@GET()
	@Produces("text/plain")
	public String sayHello() {
	    return "Hello World!";
	}
}
