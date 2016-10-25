package com.amen.solid.l_2.bad;

import com.amen.solid.l_2.Customer;

public class PlatinumCustomers extends SpecialCustomers{

	private final int maxCount = 10;
	
	public PlatinumCustomers() {
		super();
	}
	
	@Override
	public void addCustomer(Customer customer) {
		if(customerList.size() < maxCount){
			super.addCustomer(customer);	
		}else{
			throw new UnsupportedOperationException("Reached maximum number of customers for this list.");
		}
	}
}
