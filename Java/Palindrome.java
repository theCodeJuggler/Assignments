//TProgram1
import java.io.*;
class Palindrome
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter The No. :: ");
		int n= Integer.parseInt(in.readLine());
		int copy,digit,rem=0;
		
		if(n<0)
			System.out.print("false");
		else
		{
			copy=n;
			while(copy>0)
			{
				digit=copy%10;
				rem=digit+rem*10;
				copy/=10;
			}
			
			if(rem==n)
				System.out.print("true");
			else
				System.out.print("false");
		}
	}
}