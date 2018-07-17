package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot radish=new Robot();
		radish.setPenColor(255, 255, 0);
		radish.penDown();
		int n=40;
		radish.setSpeed(200);
		for(int i=0; i<n;i++) {
			radish.move(200);
			radish.turn(180*(n-2)/n);
		}
		
		
		
	}
}
