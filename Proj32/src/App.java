import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// head <- 000000000000000000000 <- tail
		// FIFO -- first item removed is first item you added

		// Queue interface instantiated of type ArrayBlockingQueue of integers
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

		// unlike linked list, array blocking queue has fixed size which can be
		// set as arg to constructor
		// queue has two separate sets of methods:
		// 1 -- add
		// 2 -- remove for the head of the queue
		// 3 -- element to look at the tail of the queue

		q1.add(10);
		q1.add(20);
		q1.add(30);
		// shows head of the queue
		// Throws no such element exception:
		// System.out.println("Head of queue is: " q1.element());

		try {

			q1.add(40);

		} catch (Exception e) {
			// TODO: handle exception

			System.out.println("Trying to add too many items to the queue ");
		}

		for (Integer value : q1) {
			System.out.println("The value is: " + value);
		}

		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		try {
			System.out.println("Removed from queue: " + q1.remove());
		} catch (NoSuchElementException e) {
			System.out.println("Too many elements removed from the queue");
		}

		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		// Adding element
		q2.add(10);
		// Offer will also add element but if it fails it will not throw error,
		// it will simply stop trying
		q2.offer(10);
		q2.offer(30);
		q2.offer(40);

		System.out.println("head of the queue" + q2.peek());

		System.out.println("queue 2 value: ");

		System.out.println(q2.poll());
		System.out.println(q2.poll());
		System.out.println(q2.poll());

	}

}
