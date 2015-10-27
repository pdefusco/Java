package world;

public class Plant {
	
	public String name;
		
	// Acceptable practice --- it's final;
	public final static int ID = 9;
	
	private String type; //can only be accessed in this very class, not its subclasses 
	
	protected String size; //can be accessed within the same package by any class
	
	int height; //no access specifier, this defaults to package level visibility
	
	public Plant(){
		this.name = "Freddy";
		this.type = "plant";
		this.size = "medium";
		this.height = 8;
	}
}
