package com.amen.solid.o_1.good;

public class TaxCalculatorPL implements ITaxCalculator {

	@Override
	public double calculateTax(double amount) {
		return amount * 0.23;
	}

}
