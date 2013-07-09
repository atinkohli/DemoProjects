package com.kohlisoft.cdi.events;

import javax.enterprise.event.Observes;

public class MessageListener {

	public void listenMessages(@Observes MessageRequestEvent event) {
		System.out.println("Received : " + event.getMessage());
	}
	
}
