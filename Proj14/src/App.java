
public class App {
	public static void main(String[] args) {

		//Runtime exception: fundamental exception that the program is unlikely to recover from; not forced to catch
		//int value = 7;
		//value = value/0;
		
		//Pointer Exception: there is no actual object implemented here, so pointer exception
		//String text = null;
		//System.out.println(text.length());
		
		//Array out of bound exception:
		String[] texts = {"one","two","three"};
		try{
			System.out.println(texts[3]);
		}
		catch(RuntimeException e){
			System.out.println("Caught");
			System.out.println(e.toString());
		}
		
		
		
		
	}
}
