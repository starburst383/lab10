
package lab10;

import java.util.Timer;
import java.util.TimerTask;

public class GarageDoor {
	boolean open;
	boolean light;
	Timer timer;
	Motor motor = new Motor();
	
	
	public GarageDoor()
	{
		//closed by default
		open = false;
		//off by default
		light = false;
		//light 20 second timer
		timer = new Timer();
		
	}
	public void open()
	{
		timer.schedule(new lightTask(), 20);
	}
	public void close()
	{
		
	}
	public void stop()
	{
		
	}
	public void onClick()
	{
		
	}
	public void onSaftey()
	{
		
	}
	public void onLimit()
	{
		
	}
	//will turn the light off after 20 seconds
	class lightTask extends TimerTask
	{
		public void run()
		{
			System.out.println("light off");
			light = false;
		}
	}
}
