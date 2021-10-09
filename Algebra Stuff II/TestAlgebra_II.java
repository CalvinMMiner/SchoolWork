import java.util.Random;
import java.text.DecimalFormat;

//This class uses a set of operations, constants, and variables extended from node to perform some basic algebra with variables
public class TestAlgebra_II
{
	static Random r = new Random();//used to ensure the random number are different when called across different methods 

	//the main method supplies a pair of ints to randOperator to create a binary tree then prints the tree concatenated with a eval, this is done twice
	public static void main(String[] args) 
	{
		DecimalFormat numberFormat = new DecimalFormat("#0.0");
		int depth = 1;
		
		double[] data1 = {1,2,3};
		Node n =  randOperator(depth, 0);
		System.out.println(n+" = "+ numberFormat.format(n.eval(data1)));
		
		double[] data2 = {4,5,6};
		n =  randOperator(depth, 0);		
		System.out.println(n+" = "+ numberFormat.format(n.eval(data2)));
	}
	
	//creates a binary tree. uses operation based nodes for the branches and terminates with either a const or a variable. tree size is determined by depth
	private static Node randOperator(int depth, int currentDepth)
	{
		currentDepth++;
			switch(r.nextInt(4) )
			{
				case 0: Plus  p = new Plus  ( (currentDepth<=depth ? (randOperator(depth,currentDepth) ) : RandomConstenOrVariable() ) ,
										      (currentDepth<=depth ? (randOperator(depth,currentDepth) ) : RandomConstenOrVariable() ) ); return p;
				case 1: Minus m = new Minus ( (currentDepth<=depth ? (randOperator(depth,currentDepth) ) : RandomConstenOrVariable() ),
											  (currentDepth<=depth ? (randOperator(depth,currentDepth) ) : RandomConstenOrVariable() ) ); return m;
				case 2: Mult  M = new Mult  ( (currentDepth<=depth ? (randOperator(depth,currentDepth) ) : RandomConstenOrVariable() ),
											  (currentDepth<=depth ? (randOperator(depth,currentDepth) ) : RandomConstenOrVariable() ) ); return M;
				case 3:Divide d = new Divide( (currentDepth<=depth ? (randOperator(depth,currentDepth) ) : RandomConstenOrVariable() ),
											  (currentDepth<=depth ? (randOperator(depth,currentDepth) ) : RandomConstenOrVariable() ) ); return d;
				default:return null;
			}
	}
			
	//uses a random Boolean to return a constant or a variable at a roughly 50/50 rate
	private static Node RandomConstenOrVariable()
	{
		Node n;
		if (r.nextBoolean())return n = new Const(r.nextInt(20)+1);	
		return n = new Variable();	
	}	
	
	//takes a provided Boolean and returns a constant or a variable 
		private static Node ConstentOrVariable(Boolean b)
		{
			Node n;
			if (b)return n = new Const(r.nextInt(20)+1);	
					return n = new Variable();	
		}	
}

