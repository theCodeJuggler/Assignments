package i.co.abinc.group;
//class to implement the Laptop entity
public class Laptop {

	//Instance Members
	private String company;
	private String model;
	private String operatingSystem;
	private String processor;
	
	//Parameterized Constructor to initialize the instance members
	public Laptop(String company, String model, String operatingSystem, String processor) {
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public String getProcessor() {
		return processor;
	}
	
}
