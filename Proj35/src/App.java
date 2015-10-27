
class Runner extends Thread{
	
	//Thread is super class which has methods
	//Thread: used to run code simultaneously
	
	public void run(){
		for(int i=0; i<10;i++){
			System.out.println("Hello" + i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runner runner1 = new Runner();
		runner1.start();
		
		Runner runner2 = new Runner();
		runner2.start();
		
	}

}
