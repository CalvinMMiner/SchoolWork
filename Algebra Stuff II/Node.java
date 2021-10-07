//basic node that sets the foundations for the more complex classes
public abstract class Node 
{
	public Node() {	}
		
	//abstract method to be replaced in the more complex classes
	public abstract double eval(double[] data);
	
	//abstract method to be replaced in the more complex classes
	public abstract String toString();
}
