package com.kohlisoft.rest.webservice;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/SampleRest")
public class SampleRestOperations {

	@GET()
	@Produces("text/plain")
	@Path("/hello")
	public String sayHello() {
	    return "Hello World!";
	}
	
	@GET()
	@Produces("text/xml")
	@Path("/time")
	public String getTime() {
	    return (new Date()).toString();
	}
}
