import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Hello, Java");
		JLabel label = new JLabel("Hello, Java", JLabel.CENTER);
		frame.add(label);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		
		
	}

}