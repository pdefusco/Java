import java.util.Scanner;
public class ApplicationSix {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer line of text: ");
		
		String line = input.nextLine();
		
		System.out.println("You entered " + line);
	}
}
