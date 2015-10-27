
class Machine{
	public void start(){
		System.out.println("Starting machine...");
	}
}

interface Plant{
	public void grow();//interface, so method is not implemented here
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine machine1 = new Machine(){ //the class here is actually not machine, but child class of machine that doesnt have a name --- "Anonymous class"
			@Override //overriding the method from within the constructor
			public void start(){
				System.out.println("Camera Snapping ....");
			}
		};
		machine1.start();
		
		Plant plant1 = new Plant(){

			@Override
			public void grow() {
				// TODO Auto-generated method stub
				System.out.println("Plant Growing");
			}
			
		};
		plant1.grow();
	}

}
