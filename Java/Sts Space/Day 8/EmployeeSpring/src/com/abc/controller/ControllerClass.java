package com.abc.controller;

import java.util.List;

import com.abc.emplyeeDefn.Employee;
import com.abc.serviceLayer.EmployeeSL;

public class ControllerClass {

	EmployeeSL emplsl;
	
	public void addEmployee(Employee employee) {

		emplsl.addEmployee(employee);
	}
	
	public List<Employee> viewAllEmpl() {
		
		return emplsl.viewAllEmpl();
	}

	public Employee getEmpById(String ID) {
		
		return emplsl.getEmpById(ID);
	}
	
	public void deleteEmp(String ID) {
		
		emplsl.deleteEmp(ID);
	}
}
