package com.kohlisoft.cdi;

import javax.enterprise.event.Event;
import javax.inject.Inject;

import com.kohlisoft.cdi.events.MessageRequestEvent;
import com.kohlisoft.cdi.qualifiers.Simple;

@Simple
public class SimpleMessageProvider implements MessageProvider {

	@Inject
	private Event<MessageRequestEvent> events;
	
	@Override
	public String getMessage() {
		events.fire(new MessageRequestEvent("Going to fire this message " + "Hello World!!!" ));
		return "Hello World!!! ;)";
	}

}
