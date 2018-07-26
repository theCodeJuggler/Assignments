//to implement the abstract methods
class C implements B
{
	//implementing the abstract method from A
	public void disp1()
	{
		System.out.println("Disp1");
	}
	
	//implementing the abstract method from B
	public void disp2()
	{
		System.out.println("Disp2");
	}
	
	//instance method for C class
	public void dispC()
	{
		System.out.println("For C class");
	}
}
