class Machine{
	private String name;
	private int code;
	
	public Machine(){
		this("Bettie", 0);
		System.out.println("Constructor Running");
		name = "Arnie";
		System.out.println(name);
		
	}
	
	public Machine(String name){
		this(name,0);
		System.out.println("Second constructor running");
		this.name = name;
		System.out.println(name);
	}
	
	public Machine(String name, int code){
		System.out.println("Third constructor running");
		this.name = name;
		this.code = code;
		System.out.println(name);
	}
}

public class ApplicationSixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine machine1 = new Machine();
		//new Machine();
		
		Machine machine2 = new Machine("Bertie");
		
		Machine machine3 =  new Machine("Bertie", 3);
	}

}
