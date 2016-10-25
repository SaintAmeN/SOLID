package com.amen.solid.l_2.good;

import com.amen.solid.l_2.Customer;

public class PlatinumCustomers implements ICustomersCollection{

    protected Customer[] customerList ;
    protected int iterator ;
    
	public PlatinumCustomers() {
    	customerList = new Customer[5];
    	iterator = 0;
	}
	
	@Override
	public void addCustomer(Customer customer) {
		if(iterator < customerList.length){
			customerList[iterator++] = customer;
		}else{
			throw new UnsupportedOperationException("Reached maximum number of customers for this list.");
		}
	}
	
	@Override
	public void removeCustomer(Customer customer) {
		iterator--;
	}
}
