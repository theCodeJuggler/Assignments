//WProgram9
//searching an element in the array
import java.io.*;
class Srch
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//initializing the array
		int ar[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		//user input of the search key
		System.out.print("Enter Number : ");
		int n = Integer.parseInt(in.readLine());
		
		int l=ar.length;		//calculating array length
		int flag=0;
		
		//linear search for the search key in the array
		for(int i=0;i<l;i++)
		{
			if(ar[i]==n)
			{
				flag=1;	//if key is found in the array then breaking out of the array after setting flag=1
				break;
			}
		}
		
		//if the element is present then the flag is 1 except flag is 0
		if(flag==1)
			System.out.print(n+" is present in the array");
		else
			System.out.print(n+" is not present in the array");
	}
}
