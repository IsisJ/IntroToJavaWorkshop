package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	private static final int i = 0;

	public static void main(String[] args) {
		// 1. Create a new Robot
		 Robot Tip =new Robot ();
		// 5. Set your robot's pen to the down position
Tip.penDown();
		// 3. Set the robot to go at max speed (10)
Tip.setSpeed(10);
		// 4. Do the following (steps 6-9) 75 times
for (int i = 0; i < 75; i++) {
			// 7. Change the pen color to random
	Tip.setRandomPenColor();
	// 6. Move the robot 5 times the current line number you are drawing (5*i)
	Tip.move(5*g);
			// 2. Turn the robot 1/3 of 360 degrees to the right
	Tip.turn(360);
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	Tip.turn(45);
			// 9. Set the pen width to i
Tip.setPenWidth(5);}

	}
}
