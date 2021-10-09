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
		Node n =  randOperator(depth);
		System.out.println(n+" = "+ numberFormat.format(n.eval(data1)));
		
		double[] data2 = {4,5,6};
		n =  randOperator(depth);		
		System.out.println(n+" = "+ numberFormat.format(n.eval(data2)));
	}
	
	//creates a binary tree. uses operation nodes picked from a Binop array for the branches and terminates with a Consent. tree size is determined by depth
	private static Node randOperator(int depth)
	{
		Node L,R;
		Random r = new Random();
		if(depth-->0) { L = randOperator(depth); R = randOperator(depth);	}
		else { L = ConstentOrVariable(r.nextBoolean()); R = ConstentOrVariable(r.nextBoolean());	}
			
		Binop[] ops = {new Plus(L,R), new Minus(L,R), new Mult(L,R), new Divide(L,R)};
		return ops[r.nextInt(4)];
	}
	
	//takes a provided Boolean and returns a constant on true or a variable on false, using r.nextBoolean() returns a constant or a variable at a roughly 50/50 rate
	private static Node ConstentOrVariable(Boolean b)
	{
		Node n;
		if (b)return n = new Const(r.nextInt(20)+1);	
		return n = new Variable();	
	}	
}

