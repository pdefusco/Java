
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot = new Robot(7);
		robot.start();
		
		//Creating an instance of brain outside of the robot class
		//When instantiating robot, you are not necessarily instantiating the inner classes as well
		//This only works if Brain is a public inner class
		Robot.Brain brain = robot.new Brain();
		brain.think();
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
		
	}

}
