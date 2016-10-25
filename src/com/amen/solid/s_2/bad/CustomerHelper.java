package com.amen.solid.s_2.bad;

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
 
    public String exportCustomerData() {
        List<Customer> customers = getAllCustomers();
        StringBuilder sb = new StringBuilder();
        
        for(Customer singleCustomer : customers) {
            sb.append(singleCustomer.getId());
            sb.append(",");
            sb.append(singleCustomer.getName());
            sb.append(",");
            sb.append(singleCustomer.getSurname());
        }
        return sb.toString();
    }
}
