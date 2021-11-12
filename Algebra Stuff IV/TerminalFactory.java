import java.text.DecimalFormat;
import java.util.Random;

/**
 * returns a random variable of constant, randomness is weighted towards variables
 */
public class TerminalFactory 
{
	DecimalFormat numberFormat = new DecimalFormat("#0.00");
	/**the number of independent variables*/private int numIndepVars;
	
	/**
	 * Determines the ration of constants to variables
	 * 
	 * @param n the number of independent variables
	 */
	TerminalFactory(int n) {	numIndepVars = n;	}   
	
	/**
	 * returns a variable or constant depending on the result of an if statement
	 * 
	 * @param rand passed random to operate the randomness 
	 * @return a random operation or variable
	 */
	public Node getTerminal(Random rand) 
	{
		int index =rand.nextInt(numIndepVars+1);
		if(index<numIndepVars) return new Variable(index);
		return new Const(Double.parseDouble(numberFormat.format(rand.nextDouble())));
	}   
	
	/**
	 * returns NumIndepVars
	 * @return the int held by NumIndepVars
	 */
	public int getNumIndepVars(){	return numIndepVars;	}
}
