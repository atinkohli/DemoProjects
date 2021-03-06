package com.oss.ericsson.cm.autoprov;

import java.util.Set;
import java.util.HashSet;
import javax.ws.rs.core.Application;

public class AutoProvApp extends Application {

	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();
	public AutoProvApp(){
	     singletons.add(new AutoProvService());
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
