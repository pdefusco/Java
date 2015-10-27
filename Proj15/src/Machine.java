
public abstract class Machine {
	
	//abstract class will not allow instantiation of machine object
	private int id;
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public abstract void start(); //now start has to be implemented in all objects of the class/subclass
	public abstract void doStuff();
	
	public void run(){
		start();
		doStuff();
	}
	
}
