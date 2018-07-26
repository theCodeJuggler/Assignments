//class to implement the logic
public class ImplementClass {

	private int variableOne;
	private static int variableTwo;
	
	public ImplementClass(int variableOne, int variableTwo)
	{
		this.variableOne = variableOne;
		this.variableTwo = variableTwo;
	}
	
	void display()
	{
		System.out.println("Variable 1 :: "+variableOne);
	}
	
	static void displayStatic()
	{
		System.out.println("Variable 2 :: "+variableTwo);
	}
}
