package com.sz.dp.structural.adapter;

public class EmployeeAdapterLdap implements Employee {

	private EmployeeLdap employeeLdap;

	public EmployeeAdapterLdap(EmployeeLdap empLdap) {
		this.employeeLdap = empLdap;
	}

	@Override
	public String getId() {

		return employeeLdap.getCn();
	}

	@Override
	public String getFirstName() {
		return employeeLdap.getGivenName();
	}

	@Override
	public String getLastName() {
		return employeeLdap.getLastName();
	}

	@Override
	public String getEmail() {
		return employeeLdap.getEmail();
	}
	
	@Override
	public String toString() {
		return employeeLdap.getCn() + " " + employeeLdap.getGivenName();
	}

}
