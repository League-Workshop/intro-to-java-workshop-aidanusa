package section2;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {

	public static void main(String[] args) throws Exception {
		Random ran = new Random();
		Robot r = new Robot();
		r.setPenColor(Color.RED);

		// 3. Put the robot's pen down
		r.penDown();

		// 6. Make the robot move as fast as possible
		r.setSpeed(500);

		// 5. Use a for loop to repeat everything below 4 times.
		for (int i = 0; i < 999999999; i++) {
			int d = ran.nextInt(300);
			int t = ran.nextInt(90);
			r.move(d);
			r.move(-d);
			r.turn(t);
		}

		// 2. Move your robot 200 pixels

		// 4. Turn the robot 90 degrees to the right

		// 7. Change steps 4 and 5 to draw a different shape (e.g. triangle (3-sides),
		// pentagon (5-sides), decagon (10-sides)).

	}
}
