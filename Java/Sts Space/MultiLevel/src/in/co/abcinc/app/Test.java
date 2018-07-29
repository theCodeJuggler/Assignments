package in.co.abcinc.app;

//driver program to instantiate the objects and cal the methods
public class Test {

	public static void main(String[] args) {
		
		//instanting the Child class 
		Child child = new Child();
		
		//calling the methods of the whole structure using child class
		child.dispGp();
		child.dispP();
		child.dispC();

	}

}
