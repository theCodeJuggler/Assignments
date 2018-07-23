//Driver program for First and second class
public class Two {

	public static void main(String args[])
	{
		First f = new First(4,2);	//instantiating objects of the first class
		Second s = new Second();	//instantiating objects of the second class
		
		f.display();	//calling display() of the first class
		s.display();	//calling display() of the second class
	}
}
