package com.kohlisoft.cdi.events;

import javax.enterprise.event.Observes;

public class FancyMessageListener {

	public void listenMessages(@Observes MessageRequestEvent event) {
		System.out.println("0000000000000 : " + event.getMessage());
	}
}
