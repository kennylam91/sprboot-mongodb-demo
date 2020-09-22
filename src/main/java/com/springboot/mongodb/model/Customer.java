package com.springboot.mongodb.model;

import org.springframework.data.annotation.Id;

public class Customer {

	@Id
	public String id;
	
	public String firstName;
	public String lastName;
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	  public String toString() {
	    return String.format(
	        "Customer[id=%s, firstName='%s', lastName='%s']",
	        id, firstName, lastName);
	  }
}
