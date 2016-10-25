package com.amen.solid.l_2.good;

import java.util.LinkedList;
import java.util.List;

import com.amen.solid.l_2.Customer;

public class SpecialCustomers implements ICustomersCollection{

    protected List<Customer> customerList ;
    
    public SpecialCustomers() {
    	customerList = new LinkedList<Customer>();
	}
    
	@Override
	public void addCustomer(Customer customer) {
        customerList.add(customer);
	}
	
	@Override
	public void removeCustomer(Customer customer) {
        customerList.remove(customer);
	}
}
