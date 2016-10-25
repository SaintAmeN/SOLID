package com.amen.solid.s_1.good;

/**
 * Class represents single warehouse. You can create many warehouses (as a company).
 * It's responsibility is to manage employees and products. 
 * Here Warehouse has one responsibility - it holds different services and only represents our warehouse
 * on some abstract level.
 * 
 * "A class should have one and only one reason to change, meaning that a class should have only one job."
 * 
 * @author AmeN
 */
public class Warehouse {

	private EmployeeService employeeService;
	private ProductService productService;
	
	public Warehouse() {
		employeeService = new EmployeeService();
		productService = new ProductService();
	}
	
	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	
	public ProductService getProductService() {
		return productService;
	}
}