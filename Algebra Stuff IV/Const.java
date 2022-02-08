import java.util.Random;

/**
 * this class holds a static number that is to be used in the other classes
 */
public class Const extends Node 
{
	/**the double this object holds*/private double value;
	
	/**
	 * sets value to the provided int
	 * @param d the new value 
	 */
	public Const(double d){	value = d; }
	
	/**
	 * sends value to a different class
	 * 
	 * @return the int in value
	 */
	public double eval(double[] data) { return value; }
	
	/**
	 * translates value into a string 
	 */
	public String toString(){	return Double.toString(value);	}
	
	/**
	 * blank method to conform to node
	 */
	public void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) {}
}
