package com.abc.ui;

import java.io.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.controller.ControllerClass;
import com.abc.emplyeeDefn.Employee;

public class InterfaceClss {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	ControllerClass ctrlClss;
	
	public void setCtrl(ControllerClass ctrlClss) {
		this.ctrlClss = ctrlClss;
	}
	
	public void start() throws NumberFormatException, IOException {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		ControllerClass ctrlClss = (ControllerClass) context.getBean("controller");
		setCtrl(ctrlClss);
		
		menu();
	}
	
	public void menu() throws IOException {
		
		int choice = 0;
		
		while(choice!=5) {
			
			System.out.println("Menu ::");
			System.out.println("1. Add Employee\n2. View All Employees\n3.Get Employee Informations\n4. Delete Employee\n5. Display");	
			System.out.print("Enter The Menu Item :: ");
			choice = Integer.parseInt(in.readLine());
			String id;

			switch (choice) {
			
				case 1:
					System.out.print("Enter The Employee ID :: ");		id = in.readLine();
					System.out.print("Enter The Employee Name :: ");	String name = in.readLine();
					System.out.print("Enter The Employee Salary :: ");	double salary = Double.parseDouble(in.readLine());
					
					Employee empl = new Employee();
					empl.setName(name);
					empl.setId(id);
					empl.setSalary(salary);
					//acceptData();			
					break;

				case 2:
					ctrlClss.viewAllEmpl().stream().forEach(System.out::println);
					//displayData();
					break;
					
				case 3:
					//id = getId();
					System.out.print("Enter The Employee ID :: ");		id = in.readLine();
					System.out.println(ctrlClss.getEmpById(id));
					break;
					
				case 4:
					//id = getId();
					System.out.print("Enter The Employee ID :: ");		id = in.readLine();
					ctrlClss.deleteEmp(id);
					break;
				
				default:
					System.out.println("Wrong Choice");
					break;
			}
		}		
	}

	/*public String getId() throws IOException {
		System.out.print("Enter The Employee ID :: ");		String id = in.readLine();
		
		return id;
	}

	public void displayData() {

		ctrlClss.viewAllEmpl().stream().forEach(System.out::println);
		
	}

	public void acceptData() throws IOException {
		
		System.out.print("Enter The Employee ID :: ");		String id = in.readLine();
		System.out.print("Enter The Employee Name :: ");	String name = in.readLine();
		System.out.print("Enter The Employee Salary :: ");	double salary = Double.parseDouble(in.readLine());
		
		Employee empl = new Employee();
		empl.setName(name);
		empl.setId(id);
		empl.setSalary(salary);
		
	}*/
}
