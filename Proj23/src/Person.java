import java.io.Serializable;

//To make class serializable, we implement the serializable interface

public class Person implements Serializable {

	/**
	 * 
	 */
	//really a way to prevent people from deserialize objects when the class has changed
	private static final long serialVersionUID = 4801633306273802062L;
	
	//Use transient keyword to prevent fields from being serialized
	private transient int id;
	private String name;
	
	private static int count;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	
	public static int getCount() {
		return count;
	}



	public static void setCount(int count) {
		Person.count = count;
	}



	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "] count is " + count;
	}

}
