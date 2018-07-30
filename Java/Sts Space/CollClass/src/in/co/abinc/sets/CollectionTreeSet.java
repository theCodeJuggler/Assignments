package in.co.abinc.sets;

import java.util.Set;
import java.util.TreeSet;

//creating tree set
public class CollectionTreeSet {

	public static void main(String[] args) {
		
		Set<String> nameSet=new TreeSet<String>();
		
		//adding names in an order
		nameSet.add("Ram");
		nameSet.add("Shyam");
		nameSet.add("Jodhu");
		nameSet.add("Modhu");
		
		//displaying the results
		nameSet.stream().forEach((studentName)->System.out.println(studentName));

	}

}
