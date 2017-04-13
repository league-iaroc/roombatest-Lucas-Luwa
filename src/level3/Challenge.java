package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
	driveDirect(500,500);
	sleep(2200);
	driveDirect(-200,200);
	sleep(535);
	driveDirect(500,500);
	sleep(2100);
	driveDirect(200,-200);
	sleep(500);
	driveDirect(500,500);
	sleep(2000);
	driveDirect(-200,200);
	sleep(500);
	driveDirect(500,500);
	sleep(2500);
	driveDirect(200,-200);
	sleep(400);
	driveDirect(500,500);
	sleep(2300);
	}

	public void loop() {
	
	}
}
