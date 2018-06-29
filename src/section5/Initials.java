package section5;

import org.jointheleague.graphical.robot.Robot;

public class Initials {

	public static void main(String[] args) {
		Robot roboi = new Robot("batman");
		roboi.penDown();
		roboi.setSpeed(500);
		roboi.setAngle(30);
		roboi.move(200);
		roboi.turn(120);
		roboi.move(200);
		roboi.turn(180);
		roboi.move(100);
		roboi.turn(-60);
		roboi.move(100);
	}

}
