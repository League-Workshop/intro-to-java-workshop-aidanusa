package section2;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot r2d2 = new Robot();
		r2d2.penDown();
		r2d2.setSpeed(500);
		for (int i = 0; i < 360; i++) {
			r2d2.move(1);
			r2d2.turn(1);
		}

	}
}
