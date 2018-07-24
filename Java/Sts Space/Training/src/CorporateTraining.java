//Implementing class for Corporate Training
class CorporateTraining extends Training{
	 
	private int days;

	//Parameterized constructor
	CorporateTraining(double fees,String subject,String id,int days)
	{
		super(fees,subject,id);
		this.days=days;
	}
	
	@Override
	public double getOrderValue()
	{
		return (getFees()*days);
	}

	
}
