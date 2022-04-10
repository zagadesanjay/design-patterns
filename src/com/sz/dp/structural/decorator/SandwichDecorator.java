package com.sz.dp.structural.decorator;


/*
 * abstract decorator 
 * 
 * 
 */
public abstract class SandwichDecorator implements Sandwich{

	// Component 
	protected Sandwich customSandwich;

	public SandwichDecorator(Sandwich customSandwich) {
		super();
		this.customSandwich = customSandwich;
	}
	
	public String make() {
		return customSandwich.make();
	}
	
	
	
}
