package pack2;
//org class in the package
public class Org {
	
	private String orgName;
	private String orgId;

	//parameterized constructor
	public Org(String orgName, String orgId)
	{
		this.orgId = orgId;
		this.orgName = orgName;
	}

	//To display the display
	@Override
	public String toString() {
		return "Org [orgName=" + orgName + ", orgId=" + orgId + "]";
	}
	
	
}
