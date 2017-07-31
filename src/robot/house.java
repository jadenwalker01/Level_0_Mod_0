package robot;

import org.jointheleague.graphical.robot.Robot;

public class house {
public static void main(String[] args) {
	

		Robot Jaden = new Robot();
		
		Jaden.penDown();
		Jaden.setSpeed(10);
		for (int i = 0; i < 5; i++) {
			
		
		Jaden.move(300);
		Jaden.turn(90);
		}
		Jaden.turn(-45);
		Jaden.move(213);
		Jaden.turn(90);
		Jaden.move(213);
		Jaden.turn(45);
		Jaden.move(300);
		Jaden.turn(90);
		Jaden.move(140);
		Jaden.turn(90);
		Jaden.move(30);
		Jaden.turn(-90);
		Jaden.move(20);
		Jaden.turn(-90);
		Jaden.move(30);
		Jaden.penUp();
		Jaden.move(500);
}
}
