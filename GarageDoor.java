package Garage;

import java.util.*;

public class GarageDoor {
	
	boolean open;
	Timer timer;
	Motor motor = new Motor();
	
	public GarageDoor() {
		//closed by default
		open = false;
		//light 20 second timer
		timer = new Timer();
	}
	
	public void open() {
		
		motor.on();
	}
	
	public void close() {
		
		
	}
	
	public void stop() {
		
	}
	
	public void onClick() {
		
	}
	
	public void onSaftey() {
		
	}
	
	public void onLimit() {
		
	}	
}
