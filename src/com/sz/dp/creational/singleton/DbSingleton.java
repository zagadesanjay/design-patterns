package com.sz.dp.creational.singleton;

import java.io.Serializable;

public class DbSingleton implements Serializable{

	
	// Why volatile ?
	// because instance = new DbSingleton() this call is not atomic 
	//instance variable may be assigned to some empty object and which will get returned from first if only
	
	//operations
	//Construct Empty instance
	//assign to variable 
	//call constructor 
	private static volatile DbSingleton instance = null;

	private DbSingleton() {

		// TO avoid reflection
		
		if(instance != null) {
			throw new RuntimeException("Use getInstance method to create");
		}
		
	}

	public static DbSingleton getInstance() {
		
		if (instance == null) {
			synchronized(DbSingleton.class) {
				if(instance == null) {
					instance = new DbSingleton();
				}
			}
		}
		return instance;
	}
}
