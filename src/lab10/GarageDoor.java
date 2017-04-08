
package lab10;

public class GarageDoor {
	boolean open;
	boolean light;
	Timer timer;
	Motor motor = new Motor();
	
	
	public GarageDoor()
	{
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
		motor.on();
		motor.opening = true;
	}
	public void close()
	{
		motor.on();
		motor.opening = false;
	}
	public void stop()
	{
		motor.off();
	}
	public void onClick()
	{
		if(motor.on)
		{
			motor.off();
			motor.opening = !motor.opening;
		}
		else
		{
			motor.on();
		}
	}
	public void onSaftey()
	{
		motor.opening = !motor.opening;
	}
	public void onLimit()
	{
		motor.off();
		motor.opening = !motor.opening;
	}
}
