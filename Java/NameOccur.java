//TProgram6
//To accept names in the array and finding out whether a specific exists in the array
import java.io.*;
class NameOccur
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int counter=0;
		String name;
		
		//Accepting the size of the array
		System.out.print("Enter The array size :: "); int size=Integer.parseInt(in.readLine());
		String names[]=new String[size];
		
		//Accepting the  names in the array
		System.out.println("Enter The Names :: ");
		for(int i=0;i<size;i++)
		{
			names[i]=in.readLine();
		}
		
		//Accepting the name to be searched
		System.out.print("Enter The Name :: ");	name = in.readLine();
		
		//Checking whether the name exists in the array
		for(int i=0;i<size;i++)
		{
			if(name.equals(names[i]))
				counter++;		//incrementing the counter as the key name appears in the array
		}
		
		//if the counter variable is 0 then the name does not exist in the array else it is present in the array
		if(counter==0)
			System.out.println(name+" is not found in the Array");
		else
			System.out.println(name+" occurs "+counter+" times in the Array");
	}
}
