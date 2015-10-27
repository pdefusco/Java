
public class ApplicationEighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Inefficient 
		String info = " ";
		info += "My name is Bob";
		info += " ";
		info += "I am a builder.";
		
		System.out.println(info);
		
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Sue");
		sb.append(" ");
		sb.append("I am a new lion tamer.");
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		s.append("My name is Roger.").append(" ").append(" I am a skydiver");
		
		System.out.println(s.toString());
		
		/////Formatting
		
		System.out.print("Here is some text\tThat was a tab\n That wa s a new line");
		System.out.print("More text");
		
		System.out.printf("Total cost %-10d; number is %d\n", 5, 6);
		
		for (int i = 0; i < 20; i++){
			System.out.printf("%2d: %s\n", i, "Here is some text");
		}
		
		// Formatting floating point values 
		System.out.printf("Total value: %.5f\n", 5.6);
	}

}
