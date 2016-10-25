package com.amen.solid.s_1.bad;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.amen.solid.s_1.Employee;
import com.amen.solid.s_1.Product;

/**
 * Class represents single warehouse. You can create many warehouses (as a company).
 * It's responsibility is to manage employees and products. 
 * Two responsibilities, means it is designed wrong.
 * 
 * "A class should have one and only one reason to change, meaning that a class should have only one job."
 * 
 * @author AmeN
 */
public class Warehouse {

	private List<Product> products;
	private Set<Employee> employees;
	
	public Warehouse() {
		products = new LinkedList<>();
		employees = new LinkedHashSet<>();
	}
	
	public void registerEmployee(Employee givenEmployee){
		employees.add(givenEmployee);
	}
	
	public void addProduct(Product givenProduct){
		products.add(givenProduct);
	}
	
	public void unregisterEmployee(Employee givenEmployee){
		employees.remove(givenEmployee);
	}
	
	public void removeProduct(Product givenProduct){
		products.remove(givenProduct);
	}

	public boolean employs(Employee givenEmployee){
		return employees.contains(givenEmployee);
	}
	
	public boolean hasProduct(Product givenProduct){
		return products.contains(givenProduct);
	}
	
	public int containsCount(Product givenProduct){
		int count = 0;
		
		for(Product singleProduct : products){
			if(singleProduct == givenProduct){
				count++;
			}
		}
		
		return count;
	}
}