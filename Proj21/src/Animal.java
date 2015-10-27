
public enum Animal {
	CAT("Diccio"), DOG("Jerry"), MOUSE("Bobby");
	
	private String name;
	
	private Animal(String name){
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return "This is the anumal: " + name;
	}
	
}
