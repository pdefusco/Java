
public class App {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = Animal.CAT;
		
		switch(animal){
		case CAT:
			System.out.println("CATS");
			break;
		case DOG:
			System.out.println("DOGS");
			break;
		case MOUSE:
			System.out.println("MOUSE");
			break;
		default:
			break;

		}

		System.out.println(Animal.DOG);
		System.out.println(Animal.DOG.getClass());
		System.out.println(Animal.DOG instanceof Enum);
		System.out.println(Animal.DOG.getName());
		
		System.out.println("Enum name has as a string: " + Animal.DOG.name());

		Animal animal2 = Animal.valueOf("CAT");
		
		System.out.println(animal2);
	}

}