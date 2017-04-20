package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * complete the MAZE
	 * Hint: use bump sensors
	 */
	
	
	public void initialize() {
		
		driveDirect(500,500);
		sleep(900);
		driveDirect(-200,200);
		sleep(500);
		driveDirect(500,500);
		sleep(6200);
		driveDirect(200,-200);
		sleep(550);
		driveDirect(500,500);
		sleep(3500);
		driveDirect(200,-200);
		sleep(550);
		driveDirect(500,500);
		sleep(3000);
		driveDirect(-200,200);
		sleep(900);
		driveDirect(500,500);
		sleep(17000);
		driveDirect(-200,200);
		sleep(900);
		driveDirect(500,500);
		sleep(10000);
		
		//driveDirect(1000,1000);
		
	}

	public void loop() {
		  
		/*if(isBumpedRight()){
			driveDirect(-200,200);
			sleep(200);
			driveDirect(500,300);*/
			
		//}
		//driveDirect(500,250);
	}
}
