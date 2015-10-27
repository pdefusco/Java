
public class Car extends Copter { //Car is a Copter

/*	public void start(){
		System.out.println("Car has started");
	}
*/
	
	
	public void wipeWindShield(){
		System.out.println("Wipoing the Wind Shield");
	}

	@Override //Annotation is class Override -- if you use this, it will check that it really is overridden method
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car Started");
	}
	
	public void stop(){
		System.out.println("Car is stopped");
	}
	
	public void showInfo(){
		System.out.println(name);
	}
}
