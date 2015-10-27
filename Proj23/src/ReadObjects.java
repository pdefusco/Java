import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {
	public static void main(String[] args) {
		System.out.println("Reading File...");
		
		try(FileInputStream fi = new FileInputStream("people.bin")){
			
			ObjectInputStream os = new ObjectInputStream(fi);
			
			//Casting from readObject class to Person class
			Person person1 = (Person)os.readObject();
			//Person person2 = (Person)os.readObject();
			
			//Person[] people = (Person[])os.readObject();
			
			//@SuppressWarnings("Unchecked")
			//ArrayList<Person> peopleList = (ArrayList<Person>)os.readObject();
			
			//for (Person person: people){
			//	System.out.println(person);
			//}
			
			os.close();
			
			System.out.println(person1);
			//System.out.println(person2);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
