package com.amen.solid.l_2.bad;

import java.util.LinkedList;
import java.util.List;

import com.amen.solid.l_2.Customer;

public class SpecialCustomers{
    protected List<Customer> customerList ;
 
    public SpecialCustomers() {
    	customerList = new LinkedList<Customer>();
	}
    
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }
    
    public void removeCustomer(Customer customer){
    	customerList.remove(customer);
    }

}
