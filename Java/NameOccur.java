//TProgram6
import java.io.*;
class NameOccur
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int counter=0;
		String name;
		
		System.out.print("Enter The array size :: "); int size=Integer.parseInt(in.readLine());
		String names[]=new String[size];
		
		System.out.println("Enter The Names :: ");
		for(int i=0;i<size;i++)
		{
			names[i]=in.readLine();
		}
		
		System.out.print("Enter The Name :: ");	name = in.readLine();
		
		for(int i=0;i<size;i++)
		{
			if(name.equals(names[i]))
				counter++;
		}
		
		if(counter==0)
			System.out.println(name+" is not found in the Array");
		else
			System.out.println(name+" occurs "+counter+" times in the Array");
	}
}