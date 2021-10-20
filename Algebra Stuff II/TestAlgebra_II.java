import java.util.Random;

//This class uses a set of operations, constants, and variables extended from node to perform some basic algebra with variables
public class TestAlgebra_II
{
	static Random r = new Random();//used to ensure the random number are different when called across different methods 
	static int numIndepVars = 3;
	static int maxDepth = 5;
	
	public static void main(String[] args) 
	{
		double[] data = new double[3];
        data[0] = 3.14;
        data[1] = 2.78;
        data[2] = 1.0;
        Node[] ops = {new Plus(), new Minus(), new Mult(), new Divide()};
        
        OperatorFactory o = new OperatorFactory(ops);
        TerminalFactory t = new TerminalFactory(numIndepVars);
        Node root = o.getOperator(r);
        root.addRandomKids(o, t, maxDepth, r);
        String s = root.toString();
        System.out.println(s + " = " + root.eval(data));    
	}
	
	/**creates a binary tree. uses operation nodes picked from a Binop array for the branches and terminates with a Consent. tree size is determined by depth
	private static Node randOperator(int depth,Node L,Node R)
	{
		if(depth-->0) { L = randOperator(depth, L, R); R = randOperator(depth, L, R);	}
		else {  L = RandomConstentsOrVariables(L); R = RandomConstentsOrVariables(R);	}
			
		Binop[] ops = {new Plus(L,R), new Minus(L,R), new Mult(L,R), new Divide(L,R)};
		return ops[r.nextInt(4)];
	}
	
	//uses a random Boolean to return a constant or a variable at a roughly 50/50 rate
	private static Node RandomConstentsOrVariables(Node n)
	{
		if (r.nextBoolean())return n = new Const(r.nextInt(20)+1);	
		return n = new Variable();	
	}**/
}