package i.co.abinc.group;
//class to implement television entity
public class Television {

	//Instance members
	private String company;
	private String type;
	private boolean enabled3D  ;
	private double price;
	
	//Parameterized Constructor
	public Television(String company, String type, boolean enabled3d, double price) {
		this.company = company;
		this.type = type;
		enabled3D = enabled3d;
		this.price = price;
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getType() {
		return type;
	}
	public boolean isEnabled3D() {
		return enabled3D;
	}
	public double getPrice() {
		return price;
	}
	
}
