package lab10;
import java.time.*;

public class Light {
	Clock c;
	boolean light;
	
	public Light () {
		
		//off by default
		light = false;
		
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
		//c
	}
	public void testTimer()
	{
		
	}
	
}
