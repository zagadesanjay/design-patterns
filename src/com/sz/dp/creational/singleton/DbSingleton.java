package com.sz.dp.creational.singleton;

import java.io.Serializable;

public class DbSingleton implements Serializable{

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
