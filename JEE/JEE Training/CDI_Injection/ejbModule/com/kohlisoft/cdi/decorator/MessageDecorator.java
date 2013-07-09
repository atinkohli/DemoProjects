package com.kohlisoft.cdi.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

import com.kohlisoft.cdi.MessageProvider;

@Decorator
public class MessageDecorator implements MessageProvider{

	@Inject
	@Delegate
	@Any
	private MessageProvider mssgProv;
	
	@Override
	public String getMessage() {
		return "ATKO : " + mssgProv.getMessage();
	}

	
}
