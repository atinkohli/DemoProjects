package com.kohlisoft.cdi;

import com.kohlisoft.cdi.qualifiers.Fancy;

@Fancy
public class FancyMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hello Atin Kohli fk d World!!! ;)";
	}

}
