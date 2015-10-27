import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class HelloJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("Hello, Java2");
		frame.add(new HelloComponent2("Hello Java!"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}

class HelloComponent2 extends JComponent implements MouseMotionListener {
	String theMessage;
	int messageX = 100, messageY = 100;

	public HelloComponent2(String message) {
		theMessage = message;
		addMouseMotionListener(this);
		// once instantiated, the object of the class HelloComponent2 will
		// be a listener of the mouse movement methods that are later declared
		// Here, we have registered the class to be a listener by invoking the
		// addMouseMotionListener method
	}

	public void paintComponent(Graphics g) {
		g.drawString(theMessage, messageX, messageY);
	}

	public void mouseDragged(MouseEvent e) {
		messageX = e.getX();
		messageY = e.getY();
		repaint();
		System.out.println(e);

		// The method generates events i.e. when the mouse is moved,
		// it registers two coordinates for its location
		// By placing the method INSIDE the HelloComponent2 class, we are
		// registering the method
	}

	// We are declaring the method because we have to as the class implements
	// the interface
	// But we are not implementing the method i.e. we are not using it anywhere
	// In other words, there is no method implementation because there is no
	// method body
	public void mouseMoved(MouseEvent e) {
	}
}
