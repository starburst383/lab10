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
		//closed by default. 
		
		if(opening = true)
		{
		timer.schedule(new FinTaskO(), distRemain);
		}
		else
		{
			timer.schedule(new FinTaskC(), distRemain);
		}
		
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
	//open timer
	class FinTaskO extends TimerTask
	{
		public void run()
		{
			System.out.println("is open!");
			distRemain = 100;
			opening = false;
		}
	}
	//close timer
	class FinTaskC extends TimerTask
	{
		public void run()
		{
			System.out.println("is closed!");
			distRemain = 100;
			opening = true;
		}
	}

}
