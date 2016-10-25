package com.amen.solid.o_1.bad;

public class TaxCalculator {
	public double calculateTax(double amount, COUNTRY forCountry) {
        double  taxAmount = 0;
        switch(forCountry)
        {
            case EN:
            	taxAmount = amount * 0.12;
                break;
            case US:
            	taxAmount = amount * 0.03;
                break;
            case PL:
            	taxAmount = amount * 0.23;
                break;
        }
        return taxAmount;
    }
}
