package com.amen.solid.s_2.good;

import java.util.List;

import com.amen.solid.s_2.Customer;
import com.amen.solid.s_2.Database;

public class CustomerHelper {
	private Database databaseInstance;
 
	public CustomerHelper() {
		databaseInstance = new Database();
	}
    public List<Customer> getAllCustomers() {
        return databaseInstance.downloadCustomersList();
    }
 
    public Customer getCustomerByID(int customerid) {
    	for(Customer singleCustomer : getAllCustomers()){
    		if(singleCustomer.getId() == customerid){
    			return singleCustomer;
    		}
    	}
        return null;
    }
}
