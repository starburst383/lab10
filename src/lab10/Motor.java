package lab10;

import java.util.Timer;
import java.util.TimerTask;

public class Motor {
	int distRemain; 
	boolean opening;
	Timer timer;
	
	public Motor()
	{
		distRemain = 100;
		timer = new Timer();
	}
	
	public void on()
	{
		
		
	}
	public void off()
	{
		timer = null;
		opening = !opening;
		timer = new Timer();
		distRemain = 50;
	}
	public void reverse()
	{
		//timer.
		timer = null;
		opening = !opening;
		timer = new Timer();
		distRemain = 50;
		on();
		
	}
}
