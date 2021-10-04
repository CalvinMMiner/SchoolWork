import java.util.Scanner;
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
