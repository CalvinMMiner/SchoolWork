import java.util.Random;

//basic node that sets the foundations for the more complex classes
public abstract class Node implements Cloneable
{
	public Node() {}
		
	//abstract method to be replaced in the more complex classes
	public abstract double eval(double[] data);
	
	//abstract method to be replaced in the more complex classes
	public abstract String toString();

	//abstract method to be replaced in the more complex classes
	public abstract void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand);  
	
	//method to comply with Cloneable interface
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
