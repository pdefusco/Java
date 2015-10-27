import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array lists manage arrays internally
		//[0][1][2][3][4][5] ....
		
		List<Integer> arrayList = new ArrayList<Integer>();
		
		//Linked lists consist of elements where each element 
		//has a reference to the previous and next element
		//[0]->[1]->[2]->[3]->[4] ....
		//   <-   <-   <-   <-   
		
		List<Integer> linkedList = new LinkedList<Integer>();
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
		
	}
	
	private static void doTimings(String type, List<Integer> list){
		
		for(int i=0; i<1E5; i++){
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		for(int i=0; i<1E5; i++){
			list.add(i);
		}

		long end = System.currentTimeMillis();
		
		System.out.println("Time Taken: " + (end-start) + "ms for " + type);
	}
	//Linked List doesn't care where you add items 
	//ArrayList does and it's better to add towards the end if not the very end
	
	
}
