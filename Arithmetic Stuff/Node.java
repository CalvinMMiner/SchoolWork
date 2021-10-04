//basic node that sets the foundations for the more complex classes
public class Node 
{
	public Node() {	}
		
	//base method to be replaced in the more complex classes
	public double eval() 
	{
		System.out.println("Error: eval Node");
		return 0;
	}
	
	//base method to be replaced in the more complex classes
	public String toString()
	{
		return null;

	}
}
