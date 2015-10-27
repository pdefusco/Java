
public class Machine implements Info {
	private int id = 7;
	
	public void start(){
		System.out.println("Started");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		//class machine implements interface info so all methods from info have to be included
		System.out.println("Machine ID is: " + id);
	}
	
	
}
