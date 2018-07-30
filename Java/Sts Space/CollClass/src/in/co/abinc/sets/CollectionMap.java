package in.co.abinc.sets;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Creating map collection
public class CollectionMap {

	public static void main(String[] args)
	{
		
		Map<String,String> map=new HashMap<String,String>();
		
		//adding to map
		map.put("Ram", "Mango");
		map.put("Shyam", "Orange");
		map.put("Jodhu", "Apple");
		map.put("Modhu", "Grapes");
		
		System.out.println(map.get("Shyam"));
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		
		Set<Map.Entry<String,String>> set=map.entrySet();
		set.stream().forEach((element)->System.out.println(element.getValue()+" "+element.getKey()));
		
	}

}
