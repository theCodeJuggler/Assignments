package in.co.capgemini.app;

//Diver program to instantiate the class and call the factorial calculation function
public class FactorialMain {

	public static void main(String[] args) {
		
		Factorial fact = new Factorial();
		
		try {
			System.out.println(fact.getFactorial(1));
		}catch(InvalidInputException e) {
			e.printStackTrace();
		}
		catch(FactorialException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
