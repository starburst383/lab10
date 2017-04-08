package lab10;

public class Motor {

  int distRemain = 100;
	boolean opening;
	
	public void on()
	{
		//closed by default. 
		opening = true;
	}
	public void off()
	{
		
	}
	public void reverse()
	{
		opening = !opening;
	}
}
