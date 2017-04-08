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
			}
		
			else {
				System.out.println("Invalid entry");
			}
		}
		
		while(on) {
				
			System.out.println("Garage door is 'on'");
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
				
				if (machine.currentState == 0) {							// door is currently closed
					
					machine.next(0);										// return currentState = 2
					System.out.println("Door clicked: Door opening");
				}
				
				else if (machine.currentState == 1) {							// door is currently opened
					
					machine.next(0);											// return currentState = 3
					System.out.println("Door clicked: Door closing");
				}
				
				else if (machine.currentState == 2) { 							// door is currently opening
					
					machine.next(0);
					if (machine.motion == true) {
						
						System.out.println("Door clicked: Door is closing");
					}
					
					else {
						
						System.out.println("Door clicked: Door is stopped");
					}
				}
				
				else if (machine.currentState == 3) {							// door is currently closing
					
					machine.next(0);
					if (machine.motion == true) {
						
						System.out.println("Door clicked: Door is opening");
					}
					
					else {
						
						System.out.println("Door clicked: Door is stopped");
					}
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
