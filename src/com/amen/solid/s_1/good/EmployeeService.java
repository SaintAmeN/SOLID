package com.amen.solid.s_1.good;

import java.util.LinkedHashSet;
import java.util.Set;

import com.amen.solid.s_1.Employee;

/**
 * Service responsible for managing Employees.
 * 
 * @author AmeN
 */
public class EmployeeService {

	private Set<Employee> employees;
	
	public EmployeeService() {
		employees = new LinkedHashSet<>();
	}
	
	public void registerEmployee(Employee givenEmployee){
		employees.add(givenEmployee);
	}
	
	public void unregisterEmployee(Employee givenEmployee){
		employees.remove(givenEmployee);
	}

	public boolean employs(Employee givenEmployee){
		return employees.contains(givenEmployee);
	}
	
}
