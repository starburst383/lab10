package lab10;

public class GarageDoorSystem {
	GarageDoor DOOR = new GarageDoor();
	static Scanner keyboard = new Scanner(System.in);
	boolean on = false;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String input;
		System.out.println("type 'POWER' to turn system on");
			input = keyboard.nextLine();
			
		if(input.equalsIgnoreCase("power"))
		{
			System.out.println("Garage door is 'on'");
		}
		else
		{
			System.out.println("power most be turned on to use commands, enter 'Power'");
		}
	}

}
