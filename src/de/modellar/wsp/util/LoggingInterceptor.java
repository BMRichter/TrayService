package de.modellar.wsp.util;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingInterceptor {

	private static final Logger logger = LogManager.getLogger(LoggingInterceptor.class.getName());

	@AroundInvoke
	public Object intercept(InvocationContext iContext) throws Exception {

		logger.info("LoggingInterceptor before Invoke: " + iContext.getMethod().getName());

		Object result = iContext.proceed();

		logger.info("LoggingInterceptor after Invoke: " + iContext.getMethod().getName());

		return result;
	}
}
