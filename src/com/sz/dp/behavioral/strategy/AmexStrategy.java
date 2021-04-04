package com.sz.dp.behavioral.strategy;

public class AmexStrategy extends ValidationStrategy{

	@Override
	public boolean isValid(CreditCard creditCard) {
		return false;
	}

}
