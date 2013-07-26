package com.kohlisoft.travel.rest.service;

import java.util.Set;
import java.util.HashSet;
import javax.ws.rs.core.Application;

public class MyRESTApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();
	public MyRESTApplication(){
		empty.add(TravelService.class);
		
//	     singletons.add(new TravelService());
	}
	@Override
	public Set<Class<?>> getClasses() {
	     return empty;
	}
	@Override
	public Set<Object> getSingletons() {
	     return singletons;
	}
}
