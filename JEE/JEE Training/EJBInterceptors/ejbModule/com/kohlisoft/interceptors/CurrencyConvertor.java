package com.kohlisoft.interceptors;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

/**
 * Session Bean implementation class CurrencyConvertor
 */
@Stateless
@Interceptors(LoggingInterceptor.class)
public class CurrencyConvertor implements CurrencyConvertorRemote {


    public CurrencyConvertor() {
       
    }

	public double PoundsToEuros(double pounds) {
		return pounds / 1.2;
	}

}
