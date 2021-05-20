package com.sz.dp.behavioral.chainofresponsibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfRespLoggingDemo {

	private static final Logger logger = Logger.getLogger(ChainOfRespLoggingDemo.class.getName());
	
	public static void main(String[] args) {

		logger.setLevel(Level.FINER);
		
		ConsoleHandler handler = new ConsoleHandler();
		
		handler.setLevel(Level.FINER);
		logger.addHandler(handler);
		
		logger.finest("Finest"); // this one wont print 
		logger.finer("Finer");
		logger.fine("Fine");
		
		
		
	}

}
