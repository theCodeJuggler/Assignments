package in.co.capgemini.app;

public class Factorial {

	//function to calculate the factorial calculations
	long getFactorial(int num) throws InvalidInputException, FactorialException 
	{
		long factorial = 1;
		if(num<2)
		{
			throw new InvalidInputException("Number Cannot Be Less Than 2");
		}
		else
		{
			while(num>0)
			{
				factorial = num * factorial;
				num--;
			}
			
			//checking for the factorial getting out of int's range
			if(factorial > 2147483647)
				throw new FactorialException("Result Out of Integer Range");
		}
		
		return factorial;
	}
}
