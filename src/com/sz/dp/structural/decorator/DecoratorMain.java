package com.sz.dp.structural.decorator;

public class DecoratorMain {

	public static void main(String[] args) {

		Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
		System.out.println(sandwich.make());
		
		Sandwich dressingSandwich = new DressingDecorator(new SimpleSandwich());
		System.out.println(dressingSandwich.make());
		
		Sandwich meatSandwich = new MeatDecorator(new SimpleSandwich());
		System.out.println(meatSandwich.make());
		
		Sandwich simpleSandwich = new SimpleSandwich();
		System.out.println(simpleSandwich.make());
		
	}

}
