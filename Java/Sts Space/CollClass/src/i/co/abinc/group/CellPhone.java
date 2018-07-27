package i.co.abinc.group;

//class to implement CellPhone entity
public class CellPhone {
	
	//Instance members
	private String company;
	private String model;
	private String description;
	private String operatingSystem;
	private double price;
	
	//Parameterized Constructor
	public CellPhone(String company, String model, String description, String operatingSystem, double price) {
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getDescription() {
		return description;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public double getPrice() {
		return price;
	}
	
}
