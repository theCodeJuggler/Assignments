package in.co.abinc.sets;

import java.util.Set;
import java.util.TreeSet;

import i.co.abinc.group.Car;

//creating tree set
public class CollectionCarTreeSet {

	public static void main(String[] args) {
		
		Set<Car> carTreeSet = new TreeSet<Car>();

		//adding to the tree set
		carTreeSet.add(new Car("Renault", "Kwid", 2014, 4_00_000.00));
		carTreeSet.add(new Car("Tata", "Hexa", 2018, 9_00_000.00));
		carTreeSet.add(new Car("Mercedes-Benz", "e-Class", 2011, 50_00_000.00));

		//displaying the results
		carTreeSet.stream().forEach((car)->System.out.println(car));;

	}

}
