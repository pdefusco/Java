import java.util.Scanner;
public class ApplicationEight {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter a command: ");
		String text = input.nextLine();
		
		switch(text){
		case "start":
			System.out.println("Machine Started");
			break;
		
		case "stop":
			System.out.println("Marchine Stopped");
			break;

		default:
			System.out.println("Command Not Recognized");
		}
		
	}
}
