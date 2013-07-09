package com.kohlisoft.interceptors;

import javax.ejb.Remote;

@Remote
public interface CurrencyConvertorRemote {

	public double PoundsToEuros(double pounds);
}
