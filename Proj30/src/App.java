import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Comparator is a template type
//Only has compare method
class StringLengthComparator implements Comparator<String> {

	// method comparing values from two lists;
	// it will say which one is greater
	// if s1 == s2 return 0
	// if s1 should sort later in the list than s1, return 1
	// if s1 sorts earlier in the list, return -1

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub

		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		}
		return 0;
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> animals = new ArrayList<String>();

		animals.add("cat");
		animals.add("elephant");
		animals.add("tiger");
		animals.add("lion");
		animals.add("snake");
		animals.add("mangoose");

		// Using sort method of collections class to sort animals list

		//Passing instance of stringlencthcomparator to Collection
		Collections.sort(animals, new StringLengthComparator());

		for (String animal : animals) {
			System.out.println(animal);
		}

		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(3);
		numbers.add(4);
		numbers.add(9);
		numbers.add(1);

		Collections.sort(numbers);
	}

}
