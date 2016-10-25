package com.amen.solid.s_2;

public class Customer {

	private int id;
	private String name;
	private String surname;
	
	public Customer(int givenId, String givenName, String givenSurname) {
		id = givenId;
		name = givenName;
		surname = givenSurname;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
}
