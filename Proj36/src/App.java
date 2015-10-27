import java.util.Scanner;

class Processor extends Thread{
	
	//volatile: prevent threads caching variables from that thread
	
	private volatile boolean running = true;
	
	public void run(){
		
		while(running){
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void shutDown(){
		running = false;
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Processor proc1 = new Processor();
		//Start method will run the code in the thread method
		proc1.start();
		
		
		System.out.println("Press return to stop");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		proc1.shutDown();
		
	}

}
