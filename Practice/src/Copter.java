
public class Copter {
	
	//private String name = "Copter type 1"; //can opnly be accessed within this class
	
	String name = "Copter type 1"; //can be accessed anywhere within the package
	
	//protected String name = "Copter type 1"; // protected means it can be accessed from within anywhere in the package and in the class
	
	public void start(){
		System.out.println("Copter has started");
	}
	
	public void stop(){
		System.out.println("Copter stopped");
	}
}
