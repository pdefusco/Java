import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class HelloJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Hello, Java 3");
		frame.add(new HelloComponent3("Hello, Java 3"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}

class HelloComponent3 extends JComponent implements MouseMotionListener, ActionListener {
	String theMessage;
	int messageX = 130, messageY = 125;

	JButton theButton;

	int colorIndex;
	static Color[] someColors = { Color.BLACK, Color.BLUE, Color.GREEN, Color.ORANGE, Color.MAGENTA };

	public HelloComponent3(String message) {
		theMessage = message;
		theButton = new JButton("Change Color!");
		setLayout(new FlowLayout());
		add(theButton);
		theButton.addActionListener(this);
		// Registering the class instance as a listener of itself
		// This requires to implement the actionPerformed method
		// In the case above, we are registering the event as a listener with
		// the button
		// In the case below, we are registering the event as a listener of mouse motion 
		//So the class itself is the listener (thus the object of the class)
		//And what it is listening to is theButton. Previously, it was listening to mouse motion
		addMouseMotionListener(this);
	}

	public void paintComponent(Graphics g) {
		g.drawString(theMessage, messageX, messageY);
	}

	public void mouseDragged(MouseEvent e) {
		messageX = e.getX();
		messageY = e.getY();
		repaint();

	}

	public void mouseMoved(MouseEvent e) {
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == theButton) {
			changeColor();
		}
	}

	synchronized private void changeColor() {

		if (++colorIndex == someColors.length)
			colorIndex = 0;
		setForeground(currentColor());
		repaint();
	}

	synchronized private Color currentColor() {
		return someColors[colorIndex];
	}
}
