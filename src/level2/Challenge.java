package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(1000,1000);
		sleep(1600);
		driveDirect(-200,200);
		sleep(700);
		driveDirect(500,500);
		sleep(5000);
		driveDirect(200,-200);
		sleep(700);
		driveDirect(500,500);
		sleep(1000);
	}

	public void loop() {
	
	}
}
