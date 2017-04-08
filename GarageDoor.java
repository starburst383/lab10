package Garage;

import java.util.*;

public class GarageDoor {
	
	boolean opened;
	boolean closed;
	boolean stopped;
	Timer timer;
	Motor motor = new Motor();
	
	public GarageDoor() {
		//closed by default
		opened = false;
		closed = true;
		// door not moving so therefore stopped
		stopped = true;
		//light 20 second timer
		timer = new Timer();
	}
	
	public void open() {
		
		opened = true;
		closed = false;
		stopped = true;
	}
	
	public void close() {
		
		closed = false;
	}
	
	public void stop() {
		
		stopped = true; 
	}
	
	public void onClick() {
		
	}
	
	public void onSaftey() {
		
	}
	
	public void onLimit() {
		
	}
	//will turn the light off after 20 seconds
	
}
