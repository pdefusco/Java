import java.util.ArrayList;

class Machine {

	@Override
	public String toString() {
		return "I am a machine";
	}

}

class Camera extends Machine {

}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Machine> list1 = new ArrayList<Machine>();

		list1.add(new Machine());
		list1.add(new Machine());

		showList(list1);

		ArrayList<Camera> list2 = new ArrayList<Camera>();

		list2.add(new Camera());
		list2.add(new Camera());

		//showList(list2);
	}

	public static void showList(ArrayList<?> list) {
		for (Object value : list) {
			System.out.println(value);
		}
	}

}
