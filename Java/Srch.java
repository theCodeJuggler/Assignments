//WProgram9
import java.io.*;
class Srch
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int ar[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		System.out.print("Enter Number : ");
		int n = Integer.parseInt(in.readLine());
		
		int l=ar.length;
		int flag=0;
		
		for(int i=0;i<l;i++)
		{
			if(ar[i]==n)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==1)
			System.out.print(n+" is present in the array");
		else
			System.out.print(n+" is not present in the array");
	}
}