package com.sz.dp.structural.adapter;

public class EmployeeAdapterCSV implements Employee {

	private EmployeeCSV employeeCsv;
	
	public EmployeeAdapterCSV(EmployeeCSV employeeCsv) {
		super();
		this.employeeCsv = employeeCsv;
	}

	@Override
	public String getId() {
		return employeeCsv.getId() + "";
	}

	@Override
	public String getFirstName() {
		return employeeCsv.getFirstName();
	}

	@Override
	public String getLastName() {
		return employeeCsv.getLastName();
	}

	@Override
	public String getEmail() {
		return employeeCsv.getEmailAddress();
	}
	
	@Override
	public String toString() {
		return getId() + " "+  getFirstName();
	}

}
