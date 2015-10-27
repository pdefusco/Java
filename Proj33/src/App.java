import java.util.Iterator;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("fox");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Mouse");
		
		//to iterate throuigh list, normally would use for-each loop
		//Post Java 5
		//For each uses iterable behind the scenes
		for(String animal: animals){
			System.out.println(animal);
		}
		
		//Pre Java 5
		//Implements iterable interface
		Iterator<String> it = animals.iterator();
		
		while(it.hasNext()){
		String value = it.next();
		System.out.println(value);
		if(value.equals("cat")){
			it.remove();
		}
		System.out.println(it);
		
		}
		System.out.println();
		
	}

}
