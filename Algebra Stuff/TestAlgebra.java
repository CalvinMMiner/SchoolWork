import java.util.Random;
import java.text.DecimalFormat;

//This class uses a set of operations, constants, and variables extended from node to perform some basic algebra with variables
public class TestAlgebra 
{
	static Random r = new Random();//used to ensure the random number are different when called across different methods 

	//the main method supplies a pair of ints to randOperator to create a binary tree then prints the tree concatenated with a eval, this is done twice
	public static void main(String[] args) 
	{
		DecimalFormat numberFormat = new DecimalFormat("#0.0");
		int depth = 1;
		
		double[] data1 = {1,2,3};
		Node L=null;Node R = null;
		Node n =  randOperator(depth, L, R);
		System.out.println(n+" = "+ numberFormat.format(n.eval(data1)));
		
		double[] data2 = {4,5,6};
		n =  randOperator(depth, L, R);		
		System.out.println(n+" = "+ numberFormat.format(n.eval(data2)));
	}
	
	//creates a binary tree. uses operation nodes picked from a Binop array for the branches and terminates with a Consent. tree size is determined by depth
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
	}
}