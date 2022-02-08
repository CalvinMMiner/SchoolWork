import java.util.Random;

/**
 *  like const this class holds a value to be used by the other classes, however this value is not  set until eval is called
 */
public class Variable extends Node 
{
	/**keeps track of how many variables have been created*/private static int number;
	/**records the order in which the objects where created  */private int index;

	/**
	 * sets index to number and then increments number to keep track of the order in which this object was created, resets number at 2
	 */
	public Variable() 
	{
		index = number;
		number++;
	}

	/**
	 * Constructor that allows for index to be set manually 
	 * @param I the manualy set index
	 */
	public Variable(int I){	index = I;	}
		
	/**
	 * returns the value in data that matches index held by this object
	 * 
	 * @param data the array of values that variable can be
	 * @return a value in data	  
	 */
	public double eval(double[] data){	return data[index]; }
		
	/**
	 * returns X + index to denote the order of creation 
	 */
	public String toString(){	return "X" + index;	}
	
	/**
	 * blank method to conform to node
	 */
	public void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) {}
}
