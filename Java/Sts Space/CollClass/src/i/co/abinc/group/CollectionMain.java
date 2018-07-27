package i.co.abinc.group;

import java.util.ArrayList;
import java.util.List;

public class CollectionMain {
	
	//Adding the laptop objects to list
	public static void callLaptop()
	{
		List<Laptop> laptopList = new ArrayList<Laptop>();
		laptopList.add(new Laptop("Sony", "Vaio", "Windows", "Core i5"));
		laptopList.add(new Laptop("Dell", "Inspiron", "Linux,Windows", "Core i3"));
		laptopList.add(new Laptop("Lenovo", "Ideapad", "Linux,Windows", "Core i7"));
		
		System.out.println("The Laptops are "); 
		
		laptopList.stream().forEach((Laptop) -> System.out.println("Company- " + Laptop.getCompany() + "\nModel- "+ Laptop.getModel() + "\nOS- " + Laptop.getOperatingSystem() + "\nProcessor- " + Laptop.getProcessor() + "\n"));  

	}

	//adding the cell phone objects to the list
	public static void callCellPhones()
	{ 

		 List<CellPhone> cellPhoneList = new ArrayList<CellPhone>(); 
		 
		 cellPhoneList.add(new CellPhone("MI", "A1", "4GBRam,64GB ROM", "Snapdragon 630", 15_000.00)); 
		 cellPhoneList.add(new CellPhone("MI", "Redmi", "3GBRam,32GB ROM", "Snapdragon 530", 9_000.00)); 
		 cellPhoneList.add(new CellPhone("Apple", "iPhone X", "4GBRam,64GB ROM", "A9 Bionic", 84_000.00)); 
		 
		 
		 System.out.println("The Cellphones are "); 
		 cellPhoneList.stream().forEach((cellphone) -> System.out.println("Company- " + cellphone.getCompany() + "\nModel- "+ cellphone.getModel() + "\nDescription- " + cellphone.getDescription() + "\nOperating System- " + cellphone.getOs() + "\nPrice- " + cellphone.getPrice() + "\n")); 
		 
		 
		 	} 

	public static void main(String[] args)
	{
		
		
	}

}
