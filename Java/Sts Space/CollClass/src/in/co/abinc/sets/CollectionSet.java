package in.co.abinc.sets;

import java.util.HashSet;
import java.util.Set;

import i.co.abinc.group.*;

//Setting up the collection set
public class CollectionSet {
	
	public static void main(String[] args) 
	
	{
		//Hash Set not accepting two duplicate values
		Set<Laptop> laptopSet=new HashSet<Laptop>();
		laptopSet.add(new Laptop("Hewlett Packard", "Omen", "Linux,Windows", "Core i7"));
		laptopSet.add(new Laptop("Apple", "Mac Book Pro", "OsX", "A9"));
		laptopSet.add(new Laptop("Lenovo", "Ideapad", "Linux,Windows", "Core i7"));
		laptopSet.add(new Laptop("Lenovo", "Ideapad", "Linux,Windows", "Core i7"));//Duplicate Value
		System.out.println("The Laptop are :: ");
		laptopSet.stream().forEach((laptop)->System.out.println(laptop));	//displaying the results
		
		//Hash set not accepting two duplicate CellPhone values
		Set<CellPhone> listOfCellPhone = new HashSet<CellPhone>();
		listOfCellPhone.add(new CellPhone("Nokia", "6", "3GB Ram, 32GB ROM", "Snapdragon 400", 15_000.00));
		listOfCellPhone.add(new CellPhone("Nokia", "X6", "4GB Ram, 64GB ROM", "Snapdragon 630", 24_000.00));
		listOfCellPhone.add(new CellPhone("Apple", "iPhone X", "4GB Ram, 128GB ROM", "iOS10", 1_00_000.00));
		listOfCellPhone.add(new CellPhone("Apple", "iPhone X", "4GB Ram, 128GB ROM", "iOS10", 1_00_000.00));// Duplicate values
		System.out.println("The Cellphones are :: ");
		listOfCellPhone.stream().forEach((cellphone) -> System.out.println(cellphone));	//displaying the results
	
	}

}
