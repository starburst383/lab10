package lab10;

public class StateMachine {
int [] [] stateTable = {{2,0},{3,1,1},{4,1,2},{4,0,2}};
int currentState;
boolean motion = false;
boolean stopped = false;
GarageDoor DOOR = new GarageDoor();

public StateMachine()
{
	currentState = 0;
}

	public int next(int event)
	{
		//error, can't onSaftey if closed
		if(currentState == 0 && event == 2)
		{
			System.out.println("");
		}
		//special cases for if stopped
		else if(stopped == true)
		{
			//the old state
			if(currentState == 2)
			{
				//change to new state
				if(event == 0)
				{
					currentState = 3;
					stopped = false;
				}
				else
				{
					System.out.println("stopped, can't exicute");
				}
			}
			//the old state
			else if(currentState == 3)
			{
				//change to new state
				if(event == 0)
				{
					currentState = 2;
					stopped = false;
				}
				else
				{
					System.out.println("stopped, can't exicute");
				}
			}
			else
			{
				System.out.println("is stopped, and ");
			}
			
		}
		//no special case
		else
		{
			int pastState = currentState;
			currentState = stateTable[currentState][event];
			//if in stopped state
			if(currentState == 4)
			{
				//switch back to old state to keep track of direction. and turn stopped on.
				currentState = pastState;
				stopped = true;
			}
		}
		//return state.
		return currentState;

	}
	//Execute state
	public void Do()
	{
		if(stopped)
		{
			DOOR.stop();
			System.out.println("door is stopped");
			GarageDoorSystem.lit.testTimer();
		}
		else if(currentState == 0)
		{
			DOOR.onLimit();
			System.out.println("door is closed");
			GarageDoorSystem.lit.testTimer();
		}

		else if(currentState == 1)
		{
			DOOR.onLimit();
			System.out.println("door is opened");
			GarageDoorSystem.lit.testTimer();
			
		}
		else if(currentState == 2)
		{
			DOOR.onClick();
			System.out.println("door is opening");
			GarageDoorSystem.lit.testTimer();
			GarageDoorSystem.lit.timer();
			
		}
		else if(currentState == 3)
		{
			DOOR.onClick();
			System.out.println("door is closing");
			GarageDoorSystem.lit.testTimer();
			
		}
		else
		{
			System.out.println("error in 'Do'");
		}
	}
}
