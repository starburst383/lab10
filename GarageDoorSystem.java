package Garage;

import java.util.*;

public class GarageDoorSystem {
	
	static GarageDoor DOOR = new GarageDoor();
	static Light lit = new Light();
	static StateMachine machine = new StateMachine();
	static Scanner keyboard = new Scanner(System.in);
	static boolean on = false;
	
	
	public static void main(String[] args) {
		
		boolean query = false;
		
		while (!query) {
			
			System.out.println("type 'POWER' to turn system on");
			String consol = keyboard.nextLine();
		
			if (consol.equalsIgnoreCase("power")) {
				
				on = true;
				query = true;
				System.out.println("Garage door is 'on'");
			}
		
			else {
				System.out.println("Invalid entry");
			}
		}
		
		while(on) {
				
			System.out.println("List of Commands: \n" 
								+ " LCLICK for light click\n"
								+ " DCLICK for door click\n"
								+ " LIMIT for limit switch\n"
								+ " SAFETY for safety trigger \n"
								+ " OFF Power down and exit the program ");	
			
			String input = keyboard.nextLine();
			
			if(input.equalsIgnoreCase("off")) {
				
				System.out.println("System is now off");
				on = false;
				System.exit(0);
			}
			
			if(input.equalsIgnoreCase("lclick")) {
				
				if(lit.light == false){
					lit.light = true;
				}
				
				else if(lit.light == true){
					lit.light =false;
				}
			}
			
			if(input.equalsIgnoreCase("dclick")) {
				
				if(machine.currentState >= 0 && machine.currentState <= 3)
				{
					machine.next(0);
					machine.Do();
				}
				
				else {														// door is stopped, shouldn't ever get into this case
					
					System.out.println("Something went wrong with dClick");
				}
			}
			
			if (input.equalsIgnoreCase("limit")) {
				
			}
			
			if (input.equalsIgnoreCase("safety")) {
				DOOR.open();
			}
			
			System.out.println("Enter a command: ");
		}	
	}
}
