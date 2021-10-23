import java.text.DecimalFormat;
import java.util.Random;

public class TerminalFactory 
{
	DecimalFormat numberFormat = new DecimalFormat("#0.00");
	private int numIndepVars;
	TerminalFactory(int n) {	numIndepVars = n;	}   
	
	//returns a variable or constant depending on the result of an if statement
	public Node getTerminal(Random rand) 
	{
		int index =rand.nextInt(numIndepVars+1);
		if(index<numIndepVars) return new Variable(index);
		return new Const(Double.parseDouble(numberFormat.format(rand.nextDouble())));
	}   
	
	//returns NumIndepVars
	public int getNumIndepVars(){	return numIndepVars;	}
}
