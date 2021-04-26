package com.sz.dp.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public static List<Employee> getEmployeeList(){
		
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee emp = new EmployeeDB("123", "Sanjay", "Zagade", "abc@xyz.com");
		
		employees.add(emp);
//		This wont work
//		Employee emp = new EmployeeLdap("124", "Sagar", "Zagade", "abc@xyz.com");
		
		EmployeeLdap empLdap = new EmployeeLdap("124", "Sagar", "Zagade", "sagar@xyz.com");
		
		employees.add(new EmployeeAdapterLdap(empLdap));
		
		EmployeeCSV csv = new EmployeeCSV(125, "Saket", "Jain", "saket@sse.com");
		
		employees.add(new EmployeeAdapterCSV(csv));
		
		return employees;
		
	}
	
}
