//WProgram2
//Checking whether a number is armstrong or not
import java.io.*;
class Armstrong
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Accepting the number from the user
		System.out.print("Enter The Number :: ");
		int n = Integer.parseInt(in.readLine());
		
		int c=n, d, s=0;
		
		while(c>0)
		{
			d=c%10;		//extracting each digit from end
			s=s+d*d*d;	//creating the new number by accumulating
			c/=10;		//decrementing loop variable
		}
		//checking the armstrng number condition
		if(n==s)
			System.out.println(n+" is a Armstrong Number");
		else
			System.out.println(n+" is not a Armstrong Number");
	}
}
