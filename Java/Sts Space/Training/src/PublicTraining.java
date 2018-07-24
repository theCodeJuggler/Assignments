//Implementing class for Public Training 
class PublicTraining extends Training {
	
	private int participants;

	//Parameterized constructor
	PublicTraining(double fees,String subject,String id,int participants )
	{
		super(fees,subject,id);
		this.participants=participants;

	}

	@Override
	public double getOrderValue()
	{
		 return (getFees()*participants);
		
	}
	
}
