package com.amen.solid.s_2.good;

import java.util.List;

import com.amen.solid.s_2.Customer;

public class CustomerDataExporter {

    public static String exportCustomerData(List<Customer> customers) {
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
