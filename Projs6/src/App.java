class Machine{
	public void start(){
		System.out.println("Machine Started");
	}
}

class Camera extends Machine{
	public void start(){
		System.out.println("Camera Started");
	}
	
	public void snap(){
		System.out.println("Photo Taken");
	}
}


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		//Upcasting #2
		Machine machine2 = new Camera();
		//Upcasting #2
		//New variable of type machine refers to camera1 object
		//Machine machine2 = camera1;
		machine2.start(); 
		//this is the start method from the camera class 
		//because the variable machine2 is referencing the camera object
		//machine2.snap(); will not work because the method snap does not exist for machine, which is the type for the new variable
		
		//Downcasting #1
		Machine machine3 = new Camera();
		//machine3.snap(); //will not work alone
		Camera camera2 = (Camera)machine3; //when downcasting, Java needs confirmation so casting is necessary
		camera2.snap();//is now allowed
		camera2.start();
		
		//this will not work because once you create a Machine object you cannnot change its type to Camera
		/*Machine machine4 = new Machine();
		Camera camera3 = (Camera)machine4;
		camera3.start();
		camera3.snap();
		*/
	}

}
