package com.kohlisoft.cdi.ejb;

import javax.ejb.Remote;

@Remote
public interface MessageServiceRemote {

	public String getMessage(String role);
}
