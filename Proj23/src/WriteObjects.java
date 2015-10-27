import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
	public static void main(String[] args) {
		
		System.out.println("Writing Objects...");
		
		//Person[] people = {new Person(1,"Sue"), new Person(2, "Mike"), new Person(3,"Gino")};
		
//		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
		
		Person mike = new Person(1,"Mike");
		//because count is static, we are assigning the variable to the class and not an instance of the class
		Person.setCount(88);
//		Person gino = new Person(2,"Gino");
		
		System.out.println(mike);
//		System.out.println(gino);
		
		//this syntax automatically calls fs.close();
		try(FileOutputStream fs = new FileOutputStream("people.bin")){
		
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(mike);
//			os.writeObject(gino);

//			os.writeObject(people);
//			os.writeObject(peopleList);
			
//			os.writeInt(peopleList.size());
			
//			for(Person person: peopleList){
//				os.writeObject(person);
//			}
			
//			int num = os.readInt();
			
//			for(int i=0; i<num; i++){
//				Person person = os.readObject();
//				System.out.println(person);
//			}
			
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
