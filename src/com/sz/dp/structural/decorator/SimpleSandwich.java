package com.sz.dp.structural.decorator;


/*
 * Concrete implementation of component 
 */
public class SimpleSandwich implements Sandwich{

	@Override
	public String make() {
		return "Basic Sandwich";
	}

}
