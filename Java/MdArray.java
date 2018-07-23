//Find if a multi dimension array
import java.io.*;
class MdArray
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Accepting the dimensions of the array
		System.out.println("Enter The Number of Rows :: ");	int row=Integer.parseInt(in.readLine());
		System.out.println("Enter The Number of Columns :: ");	int col=Integer.parseInt(in.readLine());
		//Accepting the element to be searched
		System.out.println("Enter The Number To Be Searched :: ");	int key=Integer.parseInt(in.readLine());
		
		int ar[][]=new int[row][col];
		int flag=0;
		
		//Accepting the elements into the array
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				ar[i][j]=Integer.parseInt(in.readLine());
			}
		}
		
		//Searching for the element in the 2d array
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(key==ar[i][j])
				{
					flag=1;
					break;	//if element is found then flag is set to 1 and is broken out of the loop
				}
			}
			
			if(flag == 1)
				break; //to break out of the outer loop
		}
		
		//displaying the decision on the basis of the flag variable
		if(flag==1)
			System.out.println(key+" is found in the array.");
		else
			System.out.println(key+" is not present in the array.");
	}
}
