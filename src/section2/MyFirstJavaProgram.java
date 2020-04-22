package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	
		Robot rob = new Robot();
		
		rob.setSpeed(100);
		
		rob.penDown();
		
		rob.setPenColor(Color.RED);
		
		for(int i=0; i<6 ; i++) {
		
		rob.move(100);
		rob.turn(360/6);
		
		}
	}
}
