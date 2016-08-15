package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Jimmy=new Robot ();
Jimmy.move(100);
Jimmy.hide();
Robot Jen=new Robot ();
Jen.setPenColor(Color.blue);
Jen.penDown();
for (int i = 0; i < 4; i++) {
Jen.move(100);
Jen.turn(90);}

}}