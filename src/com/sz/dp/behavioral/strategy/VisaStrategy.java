package com.sz.dp.behavioral.strategy;

public class VisaStrategy extends ValidationStrategy{

	@Override
	public boolean isValid(CreditCard creditCard) {
		return false;
	}

}
