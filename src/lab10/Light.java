package lab10;

import java.util.Timer;
import java.util.TimerTask;


public class Light {
	
	boolean light;
	Timer timer;
	
	public Light () {
		
		//off by default
		light = false;
	}
	
	public void schedule() {
		
		timer.schedule(lightTask(), 20);
	}
	
	private TimerTask lightTask() {
		// TODO Auto-generated method stub
		return null;
	}

	class lightTask extends TimerTask {
		
		public void run() {
			
			System.out.println("light off");
			light = false;
		}
		
		
	}
}
