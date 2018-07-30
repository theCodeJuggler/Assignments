package i.co.abinc.group;

import java.util.ArrayList;
import java.util.List;

public class CollectionMain {

	//Adding the laptop objects to list
	public static void addLaptop()
	{
		List<Laptop> laptopList = new ArrayList<Laptop>();

		laptopList.add(new Laptop("Sony", "Vaio", "Windows", "Core i5"));
		laptopList.add(new Laptop("Dell", "Inspiron", "Linux,Windows", "Core i3"));
		laptopList.add(new Laptop("Lenovo", "Ideapad", "Linux,Windows", "Core i7"));

		//displaying the details
		System.out.println("The Laptops are :: "); 
		laptopList.stream().forEach((Laptop) -> System.out.println("Company- " + Laptop.getCompany() + "\nModel- "+ Laptop.getModel() + "\nOS- " + Laptop.getOperatingSystem() + "\nProcessor- " + Laptop.getProcessor() + "\n"));  

	}

	//adding the cell phone objects to the list
	public static void addCellPhones()
	{ 

		List<CellPhone> cellPhoneList = new ArrayList<CellPhone>(); 

		cellPhoneList.add(new CellPhone("Nokia", "6", "3GB Ram, 32GB ROM", "Snapdragon 400", 15_000.00)); 
		cellPhoneList.add(new CellPhone("Nokia", "X6", "4GB Ram, 64GB ROM", "Snapdragon 630", 24_000.00)); 
		cellPhoneList.add(new CellPhone("Apple", "iPhone X", "4GB Ram, 128GB ROM", "A9 Bionic", 1_00_000.00)); 

		//displaying the details
		System.out.println("The Cellphones are :: "); 
		cellPhoneList.stream().forEach((CellPhone) -> System.out.println("Company- " + CellPhone.getCompany() + "\nModel- "+ CellPhone.getModel() + "\nDescription- " + CellPhone.getDescription() + "\nOperating System- " + CellPhone.getOperatingSystem() + "\nPrice- " + CellPhone.getPrice() + "\n")); 

	}

	//adding the Cars objects to the list
	public static void addCars()
	{

		List<Car> carList = new ArrayList<Car>();

		carList.add(new Car("Renault", "Kwid", 2014, 4_00_000.00));
		carList.add(new Car("Tata", "Hexa", 2018, 9_00_000.00));
		carList.add(new Car("Mercedes-Benz", "e-Class", 2011, 50_00_000.00));

		//displaying the details
		System.out.println("The Cars are :: ");
		carList.stream().forEach((car) -> System.out.println("Make- " + car.getMake() + "\nModel- " + car.getModel()+ "\nYear- " + car.getYear() + "\nPrice- " + car.getPrice() + "\n"));

	}

	//adding the Television objects to the list
	public static void addTelevision()
	{

		List<Television> televisionList = new ArrayList<Television>();

		televisionList.add(new Television("LG", "LCD", true, 25_000.00));
		televisionList.add(new Television("Samsung", "LED", true, 1_00_000.00));
		televisionList.add(new Television("Sony", "Plasma", false, 15_000.00));

		//displaying the details
		System.out.println("The Televisions are :: ");
		televisionList.stream()
		.forEach((television) -> System.out.println("Company- " + television.getCompany() + "\nType- " + television.getType() + "\n3D Feature- "+ television.isEnabled3D()+ "\nPrice- " + television.getPrice() + "\n"));

	}

	//adding the School objects to the list
	public static void addSchool()
	{

		List<School> schoolList = new ArrayList<School>();

		schoolList.add(new School("St. Stephen's School", "Kolkata", "North 24 Parganas", "14"));
		schoolList.add(new School("Auxilium Convent", "Barasat", "North 24 Parganas", "24"));
		schoolList.add(new School("Delhi Public School, Megacity", "New Town Kolkata", "South 24 Parganas", "45"));

		//displaying the details
		System.out.println("The Schools are :: ");
		schoolList.stream().forEach((school) -> System.out.println("Name- " + school.getName() + "\nCity- " + school.getCity()	+ "\nDistrict- " + school.getDistrict() + "\nRank" + school.getGreatSchoolRanking() + "\n"));

	}
	
	//calling the respective functions
	public static void main(String[] args)
	{
		
		addLaptop();
		addCellPhones();
		addSchool();
		addTelevision();
		addCars();

	}

}
