import java.util.Scanner;

public class ApplicationSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		/*System.out.println("Enter number: ");
		
		int value = scanner.nextInt();
		
		while(value != 5){
			System.out.println("Enter a number: ");
			value = Scanner.nextInt();
		}*/
		
		int value = 0;
		do {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		}
		while(value!=5);
		
		System.out.println("Got 5!");

	}

}
