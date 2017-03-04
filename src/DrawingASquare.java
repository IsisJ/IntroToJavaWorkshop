import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class DrawingASquare {
	static void drawSquare(int size,Color color,int width, int xLocation, Robot bob ){
		bob.setPenColor(color);
		bob.moveTo(xLocation, 500);
		bob.setSpeed(50);
		bob.penDown();
		bob.setPenWidth(width);
		for (int i = 0; i <= 3; i++) {
			bob.move(size);
			bob.turn(90);
		}
		bob.penUp();
	}
	
	public static void main(String[] args) {
		Robot bob = new Robot();
		drawSquare(200,Color.pink,5,300,bob);
		drawSquare(300,Color.blue,15,600,bob);
		drawSquare(400,Color.cyan,30,1000,bob);
		/*
		bob.moveTo(300, 500);
		bob.penDown();
		bob.setPenColor(100, 200, 150);
		bob.setSpeed(50);
		for (int i = 0; i <= 3; i++) {
			bob.move(200);
			bob.turn(90);
		}
		*/
		
		/*
		bob.penUp();
		bob.setPenWidth(15);
		bob.moveTo(600, 500);
		bob.setPenColor(255, 255, 176);
		for (int i = 0; i <= 3; i++) {
			bob.penDown();
			bob.move(300);
			bob.turn(90);
		}
		/*
		 * 
		 
		bob.penUp();
		bob.setPenWidth(30);
		bob.moveTo(1000, 500);
		bob.setPenColor(200, 221, 221);
		for (int i = 0; i <= 3; i++) {
			bob.penDown();
			bob.move(400);
			bob.turn(90);
		}
*/	

	}
	
}
