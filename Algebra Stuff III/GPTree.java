import java.util.Random;

public class GPTree 
{    
	private Node root;    
	//private int mySize; not used in current version   
	
	GPTree() { root = null; }    
	GPTree(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) { root = o.getOperator(rand); root.addRandomKids(o, t, maxDepth, rand); }
	
	public String toString() { return root.toString(); }
	public double eval(double[] data) { return root.eval(data); }    
	
	//mySize will get number of nodes including the current node and all of its child nodes.    
	public int mySize() { return root.mySize(); }
}