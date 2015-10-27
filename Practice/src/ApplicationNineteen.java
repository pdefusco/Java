class Pig{
	
	private int id;
	private String name;
	
	public Pig(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
	/*	StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return id + ": " + name;
	*/
		return String.format("%4d: %s", id, name);
		
	}
}


public class ApplicationNineteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pig pig1 = new Pig(7, "Freddy");
		Pig pig2 = new Pig(8, "Berta");
		
		System.out.println(pig1);
		System.out.println(pig2);
		
		

	}

}
