package Garage;

import java.util.*;

public class GarageDoorSystem {
	
	static GarageDoor DOOR = new GarageDoor();
	static Light lit = new Light();
	static StateMachine machine = new StateMachine();
	static Scanner keyboard = new Scanner(System.in);
	boolean on = false;
	
	public static void main(String[] args) {
		System.out.println("type 'POWER' to turn system on");
		boolean power=true;
		while(power){
			power = false;
			String input;
			input = keyboard.nextLine();
				
			if(input.equalsIgnoreCase("power")) {
				
				power = true;
				System.out.println("Garage door is 'on'");
				System.out.println("List of Commands: \n" 
									+ " LCLICK for light click\n"
									+ " DCLICK for door click\n"
									+ " LIMIT for limit switch\n"
									+ " SAFETY for safety trigger \n"
									+ " OFF Power down and exit the program ");
				
			}
			
			else {
				System.out.println("power most be turned on to use commands, enter 'Power'");
			}
			
			if(input.equalsIgnoreCase("off")){
				
				System.out.println("System is now off");
				power = false;
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
				
				if (machine.currentState == 0) {	// door is currently closed
					
					machine.next(0);
				}
				
				else if (machine.currentState == 1) {	// door is currently opened
					
				}
				
				else if (machine.currentState == 2) { // door is currently opening
					machine.next(0);
					System.out.println("Door clicked: Door opening");
				}
				
				else if (machine.currentState == 3) {					// door is currently closing
					
					System.out.println("Door clicked: Door closing");
				}
				
				else {
					
				}
				
				/*if(DOOR.open == false) {
					DOOR.open();
					System.out.println("Door is opening");
				}
				
				else if(DOOR.open ==true) {
					DOOR.close();
					System.out.println("Door is closing");
				}*/
			}
			
			if(input.equalsIgnoreCase("limit")) {
				
			}
			
			if(input.equalsIgnoreCase("safety")) {
				DOOR.open();
			}
		}	
	}
}
