import java.util.Random;

/**
 * basic node that sets the foundations for the more complex classes
 * implements Cloneable so the child objects can use .clone()
 */
public abstract class Node implements Cloneable
{
	public Node() {}
		
	/**
	*abstract method to be replaced in the more complex classes, 
	*evaluates the child nodes  
	*
	*@param data holds a array of data that the variable class will use 
	*/
	public abstract double eval(double[] data);
	
	/**
	*abstract method to be replaced in the more complex classes, 
	*a standard toString that will return the operation or value held by the object
	*/
	public abstract String toString();

	/**
	*abstract method to be replaced in the more complex classes, 
	*this class will be used to generate algebraic expressions with the operations, constants, and variable nodes
	*
	*@param o a object that gives a random operator
	*@param t a object that gives a random constant or variable
	*@param maxDepth the maximum allowed number of child nodes beneath the root node
	*@param rand a static random to be used for the generation of the expression
	*/
	public abstract void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand);  
	
	/**
	*abstract method to be replaced in the more complex classes, 
	*will return how many nodes are beneath the node plus one for itself
	*/
	public int mySize() {return 1;}
	
	/**
	 * method to comply with Cloneable interface
	 * 
	 * @return the cloned object
	 */
	public Object clone() 
	{
		Object o = null;
		try 
		{
			o =  super.clone();        
		}        
		catch(CloneNotSupportedException e) 
		{
			System.out.println("SimpleClass can't clone.");        
		}
		return o;    
	}
}
