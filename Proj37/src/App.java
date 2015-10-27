
public class App {

	private int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		App app = new App();
		app.doWork();

	}

	public void doWork() {

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					count++;
				}
			}

		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					count++;
				}
			}
		});

		//count = 0 because we are outputting the value of count before the loops have started
		
		t1.start();
		t2.start();

		//join methods will allow starting after the thread is finished
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Count is: " + count);

	}

}
