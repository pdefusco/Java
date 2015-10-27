import java.util.ArrayList;
import java.util.HashMap;

class Animal{
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ArrayList manages array internally; 
		//it's like having an array without worrying about its size and having to remove elements from the array
		
		//generics: allow to specify what type of objects you want the class to work with
		
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		
		String animal = strings.get(1);
		System.out.println(animal);
		
		//// 
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		/// Java 7
		
		ArrayList<Animal> someList =new ArrayList<>();
	}

}
