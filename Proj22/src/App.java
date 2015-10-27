
//RECURSION: method calls itself -- a subroutine calls a subroutine

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int value = 4;
		//calculate(value);
		
		//Stack is used for local variables and remembering which methods call which methods
		//Heap is area of memory where objects are allocated when using new operator
		
		System.out.println(factorial(10));
	}

	private static int factorial(int value){
		//value = value - 1;
		//System.out.println(value);
		//Stack overflow error when calling method from within itself because we are calling the method infinitely
		//calculate(value);
		
		//This can work though if we find a way to stop it from calling itself infinitely
		//Recursion is useful when: having to do the same thing repeatedly until a certain point
		if (value == 1){
			return 1;
		}
		
		return factorial(value-1)*value;
		
	}
}
