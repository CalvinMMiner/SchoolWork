import java.util.Random;

/**
 * this class serves as a template for the +, -, *, and / classes and establishes the tree structure
 * also holds the mySize and addRandomKids methods that are used to create the expressions
 */
public class Binop extends Node 
{
	
	/**the two child nodes that are "beneth" this one*/protected Node lChild, rChild;  
	/**used to keep track of the depth for addRandomKids*/public static int depth;
	
	/**
	 *  sets the two child nodes to the given node derivative 
	 * @param l the child node node on the "left"
	 * @param r the child node node on the "right"
	 */
	public Binop(Node l, Node r) {lChild = l; rChild = r;}
	
	public Binop() {}
	
	/**
	 * returns the two branches beneath it concatenated with the appropriate operation
	 * 
	 * @return the expression lChild + rChild
	 */
	public String toString(){	return lChild.toString() + " + "+rChild.toString();	}

	/**
	*returns zero since a pure Binop node should not be made  
	*@return zero
	*/
	public double eval(double[] data) {	return 0; }
	
	/**
	*returns how many nodes are beneath this node plus one for itself
	*
	*@return returns the calculated size
	*/
	public int mySize() {return ( lChild.mySize() + 1 + rChild.mySize() );}
	
	/**
	 * this class is used to create the algebra expression: when called depth is incremented by one, saved in personalDepth and checked to see if it has hit or exceeded max depth
	 *if not and a if statement is used to determine if a new operation is added to the right node, or if it terminates. once that operation concludes depth is reset to personalDepth to
	 *account for any recursions done to add operations and the process is repeated for the left node
	 *	
	 */
	public void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) 
	{
		depth++; int personalDepth = depth;
		if (depth>=maxDepth) { lChild = t.getTerminal(rand);	rChild = t.getTerminal(rand); }
		else
		{
			if(rand.nextInt( o.getNumOps() + t.getNumIndepVars() ) < o.getNumOps() )	{ lChild = o.getOperator(rand); lChild.addRandomKids(o, t, maxDepth, rand);	}	else lChild = t.getTerminal(rand); 
			depth=personalDepth;
			if(rand.nextInt( o.getNumOps() + t.getNumIndepVars() ) < o.getNumOps() )	{ rChild = o.getOperator(rand); rChild.addRandomKids(o, t, maxDepth, rand);	}	else rChild = t.getTerminal(rand);
		}
		depth = 0;
	}	
}