package com.sz.dp.behavioral.strategy;

public class StrategyMain {

	public static void main(String[] args) {

		CreditCard amexCard = new CreditCard();

		amexCard.setCvv("123");
		amexCard.setDate("2321");
		amexCard.setNumber("1212313");
		amexCard.setStrategy(new AmexStrategy());
		System.out.println("Is Credit card valid: " + amexCard.isValid());

		CreditCard visaCard = new CreditCard();

		visaCard.setCvv("123");
		visaCard.setDate("2321");
		visaCard.setNumber("1212313");
		visaCard.setStrategy(new VisaStrategy());
		System.out.println("Is Credit card valid: " + visaCard.isValid());

	}

}
