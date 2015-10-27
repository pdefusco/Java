
class Plant{
	private String name; 
	//try to make it private
	//encapsulate the inner workings of on a class within the class 
	//so outsiders cannot access the interior of your API
	//getters and setters allow you to access the otherwise private data
	//but you can restrict use of those methods
	
	public static final int ID = 7;//final means it cannot change
	
	public String getData(){
		String data = "Some stuff " + calculateGrowthForecast();
	}
	
	private int calculateGrowthForecast(){
		return 9;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//only stuff that your end user needs should be public, but not the data if you can
//keep as much as you can private; if not, make it protected
