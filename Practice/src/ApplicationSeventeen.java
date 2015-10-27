class Thing{
	
	public final static int LUCKY_NUMBER = 7;
	
	public String name; //instance variable
	public static String description; //class variable -- associated with the class
	
	public static int count = 0;
	
	public int id;
	
	public Thing(){
		
		id = count;
		count++; //count is static not public, so it belongs to the class -- any time an object is created, count is incremented
	}
	
	public void showName(){
		System.out.println(name);
		System.out.println("Object ID" + id + description + ": " + name); //this is ok, nonstatic methods can access any data associated with the class
	}
	
	public static void showInfo(){
		System.out.println(description);
		//System.out.println(name);
		
	}
	
	//static methods can access static data
	//static methods cannot make a call to non static data
}


public class ApplicationSeventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thing.description = "I am the thing";
		
		//System.out.println(Thing.description);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		Thing.showInfo();
		
		System.out.println("Before creating objects, count is: " + Thing.count);
		
		thing1.name = "Bob";
		thing2.name = "Sue";
		
		System.out.println("After creating objects, count is: " + Thing.count);
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Math.PI);
		
		System.out.println(Thing.LUCKY_NUMBER);
	}
}
