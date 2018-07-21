//WProgram2
import java.io.*;
class Armstrong
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter The Number :: ");
		int n = Integer.parseInt(in.readLine());
		int c=n, d, s=0;
		while(c>0)
		{
			d=c%10;
			s=s+d*d*d;
			c/=10;
		}
		if(n==s)
			System.out.println(n+" is a Armstrong Number");
		else
			System.out.println(n+" is not a Armstrong Number");
	}
}