import java.util.Random;

public class TerminalFactory 
{
	private int numIndepVars;
	TerminalFactory(int n) 
	{
		numIndepVars = n;
	}   
	public Node getTerminal(Random rand) 
	{
		if(rand.nextInt(numIndepVars)<numIndepVars) return new Variable(rand.nextInt(numIndepVars)-1);
		return new Const(rand.nextDouble());
	}   
	public int getNumIndepVars() 
	{
		return numIndepVars;
		
	}
}
