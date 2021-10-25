import java.util.Random;

//this class serves as a template for the +, -, *, and / classes and establishes the tree structure
public class Binop extends Node 
{
	static Random r = new Random();//used to ensure the random number are different when called across different methods
	protected Node lChild, rChild;//these Nodes are used to create the tree structure  
	public static int depth;
	
	// basic constructor used to set the two branches to something
	public Binop(Node l, Node r) {lChild = l; rChild = r;}
	
	public Binop() {}
	
	//returns the two branches beneath it 
	public String toString(){	return lChild.toString() + " + "+rChild.toString();	}

	//basic eval so Binop can extend node
	public double eval(double[] data) {	return 0; }
	
	/**this class is used to create the algebra expression: when called depth is incremented by one, saved in personalDepth and checked to see if it has hit or exceeded max depth
	if not and a if statement is used to determine if a new operation is added to the right node, or if it terminates. once that operation concludes depth is reset to personalDepth to
	account for any recursions done to add operations and the process is repeated for the left node**/
	public void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) 
	{
		depth++; int personalDepth = depth;
		
		if (depth>=maxDepth) {  lChild = t.getTerminal(rand);	rChild = t.getTerminal(rand);	}
		else
		{
			if(rand.nextInt(o.getNumOps()+t.getNumIndepVars())<o.getNumOps())
			{	 lChild = o.getOperator(rand); lChild.addRandomKids(o, t, maxDepth, rand);		}	else lChild = t.getTerminal(rand); 
			depth=personalDepth;
			if(rand.nextInt(o.getNumOps()+t.getNumIndepVars())<o.getNumOps())
			{	 rChild = o.getOperator(rand); rChild.addRandomKids(o, t, maxDepth, rand);		}	else rChild = t.getTerminal(rand); 
		}
	}
}
/**saving the debug version of addRandomKIds just in case I need it latter
public void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) 
{
	depth++;int personalDepth= depth;
	
	System.out.println("\n");
	System.out.print(+depth);
	if (this.depth>=maxDepth) 
	{
		lChild = t.getTerminal(rand); 
		rChild = t.getTerminal(rand); 
	}
	else
	{
		if(rand.nextInt(o.getNumOps()+t.getNumIndepVars())<o.getNumOps())
		{	 lChild = o.getOperator(rand); System.out.print(" <"+depth+">");	lChild.addRandomKids(o, t, maxDepth, rand);		}
		else{lChild = t.getTerminal(rand); System.out.print(" -"+depth+"-");}
		depth=personalDepth;System.out.print(" <>");
		if(rand.nextInt(o.getNumOps()+t.getNumIndepVars())<o.getNumOps())
		{	 rChild = o.getOperator(rand); System.out.print(" {"+depth+"}");	rChild.addRandomKids(o, t, maxDepth, rand);		}
		else{rChild = t.getTerminal(rand); System.out.print(" ="+depth+"=");}
	}
}**/