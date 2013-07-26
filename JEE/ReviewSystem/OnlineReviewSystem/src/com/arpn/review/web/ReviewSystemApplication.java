package com.arpn.review.web;

import java.util.Set;
import java.util.HashSet;
import javax.ws.rs.core.Application;

public class ReviewSystemApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();
	public ReviewSystemApplication(){
	     //singletons.add(new ReviewSystem());
		empty.add(ReviewSystem.class);
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
