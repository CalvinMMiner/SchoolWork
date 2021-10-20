import java.util.Random;

//this class serves as a template for the +, -, *, and / classes and establishes the tree structure
public class Binop extends Node 
{
	static Random r = new Random();//used to ensure the random number are different when called across different methods
	protected Node lChild, rChild;//these Nodes are used to create the tree structure  
	
	// basic constructor used to set the two branches to something
	public Binop(Node l, Node r) {lChild = l; rChild = r;}
	
	public Binop() {}
	
	//returns the two branches beneath it 
	public String toString()
	{
		return lChild.toString() + " + "+rChild.toString();
	}

	//basic eval so Binop can extend node
	public double eval(double[] data) {	return 0; }
	
	public void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) 
	{
		
	}
}
