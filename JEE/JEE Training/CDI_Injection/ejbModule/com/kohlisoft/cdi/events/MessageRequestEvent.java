package com.kohlisoft.cdi.events;

public class MessageRequestEvent {

	private String message;
	
	public MessageRequestEvent(final String message) {
		this.message = message;
	}
	
	public String getMessage(){
		return message;
	}
}
