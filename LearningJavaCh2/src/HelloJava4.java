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

public class HelloJava4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Hello Java 4");
		frame.add(new HelloComponent4("Hello Java 4!"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);

	}
}

class HelloComponent4 extends JComponent implements MouseMotionListener, ActionListener, Runnable{
		
	//Implementing Runnable interface to force the objects of the class to implement 
	//the run method -- in other words, forcing the class to create its own Thread object
	
	String theMessage;
	int messageX = 150, messageY = 150;
	JButton theButton;
		
	int colorIndex;

	static Color[] someColors = {Color.BLACK, Color.BLUE, Color.ORANGE};

	boolean blinkState; // Added to prove thread synch

	// Now the constructor
	public HelloComponent4(String message) {
		// Assigning value to theMessage variable which holds String containing
		// text visualized as title of window
		theMessage = message;
		// Instantiating theButton object -- reference variable was initialized
		// earlier
		theButton = new JButton("I am the Button -- Click here!");
		setLayout(new FlowLayout());
		// Adding the button to the JFrame
		add(theButton);
		// Implementing ActionListener constructor assigning "this" object as a
		// listener to the theButton variable
		theButton.addActionListener(this);
		// Assigning "this" class as also a listener of mouse movement:
		addMouseMotionListener(this);
		// Initializing Thread by creating new thread object
		// We pass the HelloComponent4 object to the thread constructor ("this")
		//
		Thread t = new Thread(this);
		
		// starting thread -- the Thread class comes with methods to manipulate the thread
		// Once the thread starts, it continues until it is stopped by another Thread method
		//Threads always expect the run() method to be executed when they are created
		//The method run() performs the action of the new Thread
		t.start();
	}

	public void paintComponent(Graphics g) {
		// if statement: if blinkState var = True then getBakground() -- else
		// currentColor()
		g.setColor(blinkState ? getBackground() : currentColor());
		// Executing drawString with arguments below
		g.drawString(theMessage, messageX, messageY);
	}

	public void mouseDragged(MouseEvent e) {
		// Assigning the values of the message coordinates
		// The method registers mouse movements and assigns the values to the
		// messageX,Y variables
		messageX = e.getX();
		messageY = e.getY();
		repaint();
	}

	public void mouseMoved(MouseEvent e) {
	}

	public void actionPerformed(ActionEvent e) {
		// Adding method registering action executed:
		// When the event triggered equals the button varialbe, run the method
		// below
		if (e.getSource() == theButton) 
			changeColor();
		
	}

	
	//Making method synchronized so it doesn't run when the other synchronized method does
	//both synchronized methods access someColors array and if they were allowed to perform operations
	//concurrently, they would access an object that is not up to date
	//the modifier synchronized places a lock on the objects that contain the method before executing it
	synchronized private void changeColor() {
		if (++colorIndex == someColors.length) {
			colorIndex = 0;
		setForeground(currentColor());
		repaint();
		}
	}

	//Making method synchronized so it doesn't run when the other synchronized method does
	synchronized private Color currentColor() {
		return someColors[colorIndex];
	}

	
	//The method run performs the action(s) of the new Thread object
	//This run method accomplishes the goal of the new thread i.e. blinking and repainting the text
	public void run() {
		try {
			//practically an infinite while loop -- the thread will end whenever the Thread.close method is invoked
			while (true) {
				blinkState = !blinkState;
				repaint();
				//Sleep is static method of the Thread class
				Thread.sleep(300);
			}
		} catch (

		InterruptedException ie) {
		}
	}
}