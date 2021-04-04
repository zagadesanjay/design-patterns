package com.sz.dp.creational.singleton;

import java.util.logging.Logger;

public class DbSingletonDemo {

	public static void main(String[] args) {
		DbSingleton instance = DbSingleton.getInstance();
		System.out.println(instance);
		
		
		Runtime runtime = Runtime.getRuntime();
		
		
		System.out.println(runtime.availableProcessors());
		System.out.println(runtime.maxMemory());
		System.out.println(runtime.totalMemory());
		
		
		
	}

}
