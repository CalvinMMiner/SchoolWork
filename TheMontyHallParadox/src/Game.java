import java.util.Random;

//this class creates three doors and uses them to simulate a game
public class Game 
{
	Door[] doors;
	static Random r = new Random();
	
	//this constructor initializes three doors and sets hasGrandPrize to true for one door
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
	
	//this method uses a for loop to open one door that doesn't have hasGrandPrize set to true
	//and sets chosenByContestant to true for one door
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
		
	//this method switches chosenByContestant to false for one door and to true for the other door that is not open
	void SwitchDoor()
	{
		for(int i=0;i<3;i++)
		{
			if(doors[i].chosenByContestant) doors[i].chosenByContestant = false;
			
			else if(!doors[i].open)	doors[i].chosenByContestant = true;
		}
	}
	
	//checks if chosenByContestant and hasGrandPrize are both true for one door
	int Win()
	{
		
		for(int i=0;i<3;i++)
		{
			if(doors[i].chosenByContestant && doors[i].hasGrandPrize) return 1;
		}
		return 0;
	}	
}