class Person {
	String name;
	int age;

	// Data
	// Subroutines (methods)

	void speak() {
		for (int i = 0; i < 1; i++) {
			System.out.println("Hello, my name is " + name + " and my age is " + age);
		}
	}

	void sayHello() {
		System.out.println("Hello there");
	}
	
	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		
		return yearsLeft;
	}
	
	int getAge(){
		return age;
	}
	
	String getName(){
		return name;
	}
	
}

public class ApplicationTwelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person1 = new Person();
		person1.name = "Giulio";
		person1.age = 37;
		person1.speak();

		int years = person1.calculateYearsToRetirement();
		System.out.println("Years to retirement: " + years);
		
		int age = person1.getAge();
		System.out.println(age);
		
		String name = person1.getName();
		System.out.println(name);
				
		Person person2 = new Person();
		person2.name = "Flavio";
		person2.age = 37;
		person2.speak();
		person2.sayHello();
		person2.calculateYearsToRetirement();

		
	}

}
