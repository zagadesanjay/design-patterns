package com.sz.dp.structural.adapter;

public class EmployeeCSV {

	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String emailAddress;

	public EmployeeCSV(int id, String firstName, String lastName, String emailAddress) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	
	
	
}
