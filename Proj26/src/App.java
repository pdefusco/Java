import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		//Basically a look up table of key value pairs
		//Hash maps are not sorted
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "Eight");
		//Adding a key that's already been put causes overwrite
		map.put(6, "Hello");
		
		String text = map.get(6);
		
		System.out.println(text);
		
		//Map is an interface
		for(Map.Entry<Integer, String> entry: map.entrySet()){
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}	
	}
}
