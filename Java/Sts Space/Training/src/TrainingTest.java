//Driver program to test the trainig implementation
public class TrainingTest 
{
	static void getCost(Training training)
	{
		System.out.println("Training Order Value Is :: "+training.getOrderValue());
	}
	public static void main(String args[])
	{
		
		Training publicTraining = new PublicTraining(1000,"BigData","1678",100);
		System.out.println(publicTraining);
		getCost(publicTraining);
		
		Training corporateTraining=new CorporateTraining(2500,"Java","3444",5);
		System.out.println(corporateTraining);
		getCost(corporateTraining);
				
	}
	
	
}
