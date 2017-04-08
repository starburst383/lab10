
package lab10;

public class GarageDoor {
	Motor motor;
	
	public GarageDoor()
	{
		motor = new Motor();
		
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
