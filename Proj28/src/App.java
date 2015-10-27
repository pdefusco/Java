import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sET Is a kind of collection that stores only unique elements

		// Hash set does not retain order
		Set<String> set1 = new HashSet<String>();

		// Linked Hash Set remembers the order members were added:
		Set<String> set2 = new LinkedHashSet<String>();

		// Tree sets stores elements in natural order (alphabetical order for
		// strings)
		Set<String> set3 = new TreeSet<String>();

		set1.add("DOG");
		set1.add("CAT");
		set1.add("MOUSE");

		set2.add("DOG");
		set2.add("CAT");
		set2.add("MOUSE");

		set3.add("DOG");
		set3.add("CAT");
		set3.add("MOUSE");

		// adding duplicate items:

		set1.add("DOG");

		System.out.println(set1);

		// Iterating through sets with for each loop
		for (String element : set1) {
			System.out.println(element);
		}

		// Does set contain particular items:
		if (set1.contains("GIRAFFE")) {
			System.out.println("Contains Giraffe");
		}
		
		if (set1.contains("MOUSE")){
			System.out.println("Contains Mouse");
		}
		
		if(set1.isEmpty()){
			System.out.println("Set is empty");
		}
		
		////Intersection
		Set<String> set4 = new TreeSet<String>();
		
		set4.add("DOG");
		set4.add("CAT");
		set4.add("ALBATROS");
		
		Set<String> intersection = new HashSet<String>(set3);
		//pass set3 to the constructor -> intersection will be copy of set3
		System.out.println(intersection);
		//Retaining only the interesection of set 3 and set 4 into set intersection
		intersection.retainAll(set4);
		
		System.out.println(intersection);
		
		//Difference
		Set<String> difference = new HashSet<String>();
		difference.removeAll(set3);
		System.out.println(difference);
		
	}

}
