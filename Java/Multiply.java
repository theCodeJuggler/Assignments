//Word program1
//INPUT - 5 .... OUTPUT - 5*1=5, Square: 25
import java.io.*;
class Multiply
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Accepting the number from the user
		System.out.print("Enter The Number :: ");
		int n = Integer.parseInt(in.readLine());
		
		//Calculating the square
		int result = mul(n);
		
		//Displaying the result in the desired format
		System.out.println(n+" * 1 = "+(n*1)+", Square: "+result);
	}
	
	//function to calculate the square of the number
	static int mul(int n)
	{
		return (n*n);
	}
}
