//TProgram1
//To check palindrome
import java.io.*;
class Palindrome
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//accepting the user input
		System.out.print("Enter The No. :: ");
		int n= Integer.parseInt(in.readLine());
		
		int copy,digit,rem=0;
		
		
		if(n<0)			//negative number will not be a palindrome
			System.out.print("false");
		else
		{
			copy=n;		//making a copy of the inputted the number for extracting the digits
			while(copy>0)
			{
				digit=copy%10;		//extracting a digit from the rear
				rem=digit+rem*10;	//forming the new number
				copy/=10;		//loop variable
			}
			
			//if the formed number is equal to the accepted number then it is palindrome
			if(rem==n)
				System.out.print("true");
			else
				System.out.print("false");
		}
	}
}
