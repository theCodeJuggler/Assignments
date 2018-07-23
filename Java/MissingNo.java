//TProgram5
//Finding out missing numbers from 0 to n in an array
import java.io.*;
class MissingNo
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Accepting the number of inputs
		System.out.print("Enter The array size :: "); int size=Integer.parseInt(in.readLine());
		int ar[]=new int[size];
		int sum=0;
		
		//Accepting the array elements
		System.out.print("Enter The array elements:: ");
		for(int i=0;i<size;i++)
		{
			ar[i]=Integer.parseInt(in.readLine());
			sum+=ar[i];				//calculating the sum of the inputted number	
		}
		
		
		int total = (size+1)*(size)/2;			//calculating the sum of numbers from 1 to n
		
		System.out.print("Missing No. = "+(total-sum));	//calculating the missing number
	}
}
