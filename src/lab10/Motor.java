package lab10;

public class Motor {
	boolean opening;
	boolean on;
	
	public Motor()
	{
		opening = true;
		on = false;
		
	}
	public void on()
	{
		on = true;
		
	}
	public void off()
	{
	on = false;	
		
	}
	public void reverse()
	{
		
		opening = !opening;
		
		
	}
}
