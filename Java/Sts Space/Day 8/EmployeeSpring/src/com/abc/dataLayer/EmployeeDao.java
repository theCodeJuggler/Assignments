package com.abc.dataLayer;

import java.util.ArrayList;
import java.util.List;

import com.abc.emplyeeDefn.Employee;

public class EmployeeDao {

	List<Employee> emplList = new ArrayList<>();

	public void addEmployee(Employee employee) {

		emplList.add(employee);
	}

	public List<Employee> viewAllEmpl() {

		return emplList;

	}

	public Employee getEmpById(String ID) {
		
		for(Employee employee : emplList)
		{
			if(employee.getId().equals(ID))
				return employee;
		}
		
		return null;
	}
	
	public void deleteEmp(String ID) {
		
		for(Employee employee : emplList)
		{
			if(employee.getId().equals(ID))
				emplList.remove(employee);
		}
	}
}
