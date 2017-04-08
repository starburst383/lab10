package lab10;
import java.util.concurrent.TimeUnit;
public class Light {
	//current time
	
	//snapshot of time
	//java.util.concurrent.TimeUnit.
	long runTime;
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
		runTime = System.currentTimeMillis();
	}
	public void testTimer()
	{
		if (runTime < System.currentTimeMillis()-20000  && light)
		{
			OFF();
		}
	}
	
}
