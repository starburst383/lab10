package lab10;
import java.time.*;

public class Light {
	//current time
	Clock c;
	//snapshot of time
	Instant snap;
	boolean light;
	
	public Light () {
		
		//off by default
		light = false;
		c.getZone();
	}
	
	public void ON()
	{
		light = true;
		System.out.println("light is on");
	}
	public void OFF()
	{
		light = false;
		System.out.println("light is off");

	}
	public void timer()
	{
		ON();
		snap = c.instant();
	}
	public void testTimer()
	{
		if (snap.toEpochMilli() < c.millis()-20000)
		{
			OFF();
		}
	}
	
}

