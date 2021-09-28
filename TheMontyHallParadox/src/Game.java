import java.util.Random;

public class Game 
{
	Door[] doors;
	static Random r = new Random();
	
	void setUpGame() 
	{
		doors = new Door[3];
		int grandPrizeDoor = r.nextInt(3);
		for(int i=0;i<3;i++)
		{
			doors[i] = new Door();
			if(i==grandPrizeDoor) doors[i].hasGrandPrize = true;
		}
	}
	
	void ChooseDoor()
	{
		int contestantDoor = r.nextInt(3);
		int j=0;

		for(int i=0;i<3;i++)
		{			
			if(i==contestantDoor) doors[i].chosenByContestant = true; 
			
			else if(!doors[i].hasGrandPrize && j == 0)
			{
				doors[i].open= true; 
				j++;
			}
		}
	}
		
	void SwitchDoor()
	{
		for(int i=0;i<3;i++)
		{
			if(doors[i].chosenByContestant) doors[i].chosenByContestant = false;
			
			else if(!doors[i].open)	doors[i].chosenByContestant = true;
		}
	}
	
	int Win()
	{
		
		for(int i=0;i<3;i++)
		{
			if(doors[i].chosenByContestant && doors[i].hasGrandPrize) return 1;
		}
		return 0;
	}	
}