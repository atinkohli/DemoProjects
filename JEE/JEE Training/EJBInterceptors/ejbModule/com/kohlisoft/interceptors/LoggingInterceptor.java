package com.kohlisoft.interceptors;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
public class LoggingInterceptor {

	@AroundInvoke
	public Object logging(InvocationContext ctx) throws Exception {
		
		System.out.println("Before Calling method");
		
		Object result = ctx.proceed();
		
		System.out.println("After Calling method");
		
		return result;
	}
}
