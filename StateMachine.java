package lab10;

public class StateMachine {
int [] [] stateTable = {{2,0},{3,1,1},{4,1,2},{4,0,2}};
int currentState;
boolean stopped;
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
		else if(currentState == 4)
		{
			if(event == 2)
			{
				
			}
			if(event == 3)
			{
				
			}
		}
		else
		{
			currentState = stateTable[currentState][event];
			if(currentState == 4)
			{
				stopped = true;
			}
		}
		return currentState;

	}
}
