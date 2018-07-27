package i.co.abinc.group;
//class to implement car entity
public class Car {

	//instance members
	private String make;
	private String model;
	private int year;
	private double price;
	
	//Parameterized constructor
	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}
	
	
}
