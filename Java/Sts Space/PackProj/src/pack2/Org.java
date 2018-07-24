package pack2;

public class Org {
	
	private String orgName;
	private String orgId;

	Org(String orgName, String orgId)
	{
		this.orgId = orgId;
		this.orgName = orgName;
	}

	@Override
	public String toString() {
		return "Org [orgName=" + orgName + ", orgId=" + orgId + "]";
	}
	
	
}
