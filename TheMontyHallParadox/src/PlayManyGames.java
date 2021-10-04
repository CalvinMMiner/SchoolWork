import java.util.Scanner;

//this class uses game and the scanner to simulate a vast number a games
//scanner is used to determine if the switch method is called
// and once the simulation is complete it prints out the % of wins 
public class PlayManyGames 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("if you want to switch doors please enter Y");
		String Switch = sc.nextLine();
		sc.close();
		
		Game theGame = new Game();
		float wins = 0;
						
		for(int i =0;i<10000;i++)
		{
			theGame.setUpGame();
			theGame.ChooseDoor();
			
			if(Switch.equalsIgnoreCase("y")) theGame.SwitchDoor();
			
			wins += theGame.Win();
		}
		
		System.out.println("you won: "+wins/100+"% of your attempts");
	}
}
