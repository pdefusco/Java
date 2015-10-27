
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine mach1 = new Machine();
		mach1.start();
		
		Person person1 = new Person("Bob");
		person1.greet();
		
		Info info1 = new Machine(); //machine implements info interface so I can do this
		info1.showInfo(); //only showInfo method can be accessed here because it has been declared in the interface
		
		Info info2 = person1;
		info2.showInfo();
		
		outputInfo(mach1);
		outputInfo(person1);

	}

	private static void outputInfo(Info info){
		info.showInfo();
	}
}
