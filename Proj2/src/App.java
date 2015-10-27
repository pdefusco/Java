import world.Plant;


// Private -- only within same class
// Public -- from anywhere
// Protected -- same class, same subclass, and same package
// No modifier -- same package only

// Classes can't be private - access modifier only applies to instance variables
// Classes can be declared without access modifier though

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		System.out.println(plant.ID);
		
		//System.out.println(plant.size); won't work, different package
		//System.out.println(plant.heigth); won't work, different pakcage
	}

}
