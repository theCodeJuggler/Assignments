//TProgram5
import java.io.*;
class MissingNo
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter The array size :: "); int size=Integer.parseInt(in.readLine());
		int ar[]=new int[size];
		int sum=0;
		
		System.out.print("Enter The array elements:: ");
		for(int i=0;i<size;i++)
		{
			ar[i]=Integer.parseInt(in.readLine());
			sum+=ar[i];
		}
		
		int total = (size+1)*(size)/2;
		
		System.out.print("Missing No. = "+(total-sum));
	}
}