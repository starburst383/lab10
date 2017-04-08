package lab10;

public class StateMachine {
int [] [] stateTable = {{2,0},{3,1,1},{4,1,2},{4,0,2}};
int currentState;
boolean stopped = false;
	public StateMachine()
	{
		currentState = 0;
	}

	public int next(int event)
	{
		if(currentState == 0 && event == 2)
		{
			System.out.println("");
		}
		else if(stopped == true)
		{
			if(currentState == 2)
			{
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
			if(currentState == 3)
			{
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
		}
		else
		{
			int pastState = currentState;
			currentState = stateTable[currentState][event];
			if(currentState == 4)
			{
				currentState = pastState;
				stopped = true;
			}
		}
		return currentState;

	}
}
