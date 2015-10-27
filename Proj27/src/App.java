import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Temp {

}

// List, maps and

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hash map key/value pairs not in order
		//We are using the Map interface to reference the new object; old syntax:
		//HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		
		// to keep them in order, use Linked Hash Map
		// keys and values stay in the same order used to add them to the map
		//LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		// Tree map
		// Tree is basic structure in computing, sorts data in natural order
		// i.e. 3,4,2 will be 2,3,4
		//TreeMap<Integer, String> TreeMap = new TreeMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();

		// the 53d26552 value output is the hash code, which is used to store
		// things in the hash map
		// Linked hash map is the same except it has a link
		System.out.println(new Temp());
		
		testMap(linkedHashMap);

	}

	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(7, "sette");
		map.put(3, "three");
		map.put(5, "fifth");

		//Having the key we can iterate through the values
		for (Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key+ ": " + value);
		}
	}
}
