package com.kohlisoft.cdi.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

import com.kohlisoft.cdi.MessageProvider;

@Decorator
public class ToUpperMessageDecorator  implements MessageProvider {

	@Inject
	@Delegate
	@Any
	private MessageProvider msgPrv;
	
	@Override
	public String getMessage() {
		return "CHK : " + msgPrv.getMessage().toUpperCase();
	}

}
