package com.sz.dp.structural.adapter;

public class EmployeeLdap {

	private String cn;
	private String givenName;
	private String lastName;
	private String email;
	
	public EmployeeLdap(String cn, String givenName, String lastName, String email) {
		super();
		this.cn = cn;
		this.givenName = givenName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
