package com.logs;

import org.apache.logging.log4j.LogManager;

public class Logger {

	private static final org.apache.logging.log4j.Logger LOGGER = LogManager
			.getLogger(Thread.currentThread().getClass().getName());

	public static void logTrace(String msg) {
		LOGGER.trace(msg);
	}

	public static void logInfo(String msg) {
		LOGGER.info(msg);
		getCallingMethodName();
	}

	public static void logError(String msg) {
		LOGGER.error(msg);
	}

	public static void logFatal(String msg) {
		LOGGER.fatal(msg);
	}

	/**
	 * Index number is the key element here; it determines which method name will be
	 * returned from the call stack.
	 * 
	 * @return name of the method that logged the statement; useful for debugging
	 */
	private static void getCallingMethodName() {
		LOGGER.info(String.format("LOGGED BY - %s", Thread.currentThread().getStackTrace()[3]));
	}

}
