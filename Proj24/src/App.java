import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> theList = new ArrayList<Integer>();
		
		theList.add(19);
		theList.add(100);
		theList.add(1);
		
		//Retrieving the values
		System.out.println(theList.get(0));
		
		System.out.println("Iteration #1: ");
		//Use for loop
		for(int i=0; i<theList.size();i++){
			System.out.println(theList.get(i));
		}
		
		System.out.println("\nIteration #2: ");
		for(Integer value: theList){
			System.out.println(value);
		}
		//Careful when removing items: it's fine to remove items from the end...
		theList.remove(2);
		System.out.println(theList);
		//But it's not as safe to remove items from the beginning:
		//This is slow because all subsequent items need to be copied one step back
		theList.remove(0);
		System.out.println(theList);
		
		// List interface...
		//Collections classes are grouped by interfaces
		//values variable can point to anything implementing the List interface;
		//the object in this case is clearly a new ArrayList
		List<String> values = new ArrayList<String>();
		
	}

}
