package com.abc.serviceLayer;

import java.util.List;

import com.abc.dataLayer.EmployeeDao;
import com.abc.emplyeeDefn.Employee;

public class EmployeeSL {
	
	EmployeeDao empD;
	
	public void addEmployee(Employee employee) {

		empD.addEmployee(employee);
	}
	
	public List<Employee> viewAllEmpl() {
		
		return empD.viewAllEmpl();
	}

	public Employee getEmpById(String ID) {
		
		return empD.getEmpById(ID);
	}
	
	public void deleteEmp(String ID) {
		
		empD.deleteEmp(ID);
	}
}
