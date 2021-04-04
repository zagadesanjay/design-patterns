package com.sz.dp.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList(){
		
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee emp = new EmployeeDB("123", "Sanjay", "Zagade", "abc@xyz.com");
		
		return employees;
		
	}
	
}
