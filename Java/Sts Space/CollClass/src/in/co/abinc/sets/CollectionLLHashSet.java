package in.co.abinc.sets;

import java.util.LinkedHashSet;
import java.util.Set;

//creating hash set
public class CollectionLLHashSet {
	
	public static void main(String[] args)
	{
		Set<String> nameSet=new LinkedHashSet<String>();
		
		//adding names in an order
		nameSet.add("Ram");
		nameSet.add("Shyam");
		nameSet.add("Jodhu");
		nameSet.add("Modhu");
		
		//Displaying the results
		nameSet.stream().forEach((studentName)->System.out.println(studentName));
		
	}

}
