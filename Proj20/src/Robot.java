
public class Robot {
	private int id;

	class Brain {

		// Non static, aka nested class
		// this class has access to instance data of Robot class
		// Used to logically group pieces of classes
		// Inner class can have public or private access modifier -- here it's
		// the same

		public void think() {
			System.out.println("Robot " + id + " is thinking");
		}
	}

	// This is static so we can't refer to the ID variable
	// It would work if ID had been declared as a static variable
	// Static inner classes used to group inner classes together
	// Static class is not associated with instances of outer class
	// Other than being grouped with Robot class, it has nothing else in common

	static class Battery {
		public void charge() {
			System.out.println("Battery Charging" /* + id */);
		}
	}

	public Robot(int id) {
		this.id = id;
	}

	public void start() {
		System.out.println("Starting Robot " + id);

		Brain brain = new Brain();
		brain.think();

		// This variable will work only if it's final because it's a local
		// variable
		final String name = "Robert";

		// Declare class within method:
		class Temp {
			public void doSomething() {
				// can use instance variable id just fine, but name var has to
				// be final if it's a local variable
				System.out.println("ID is: " + id);
				System.out.println("My name is " + name);
			}
		}
		Temp temp = new Temp();
		temp.doSomething();

	}

}
