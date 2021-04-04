package com.sz.dp.behavioral.strategy;

public class CreditCard {

	private String number;
	private String date;
	private String cvv;
	
	private ValidationStrategy strategy;
	
	public boolean isValid() {
		// here we would have too many if else statements based on different credit cards validation strategies
		// which is now moved out 
		// we can easily add new strategy without modifying this code
		// Client stays clean, its know all strategies 
		return strategy.isValid(this);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public ValidationStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(ValidationStrategy strategy) {
		this.strategy = strategy;
	}
	
	
	
	
	
	
}
