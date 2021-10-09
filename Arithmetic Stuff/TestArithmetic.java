import java.util.Random;
import java.text.DecimalFormat;

//This class uses Node and its descendants to perform some basic Arithmetic with { + - * / }
public class TestArithmetic 
{
	static Random r = new Random();//used to randomize the classes and constants

	//the main method uses the methods randOperator to generate the Arithmetic expressions
	public static void main(String[] args) 
	{
		for(int i =0;i<5;i++)
		{
			int depth = 1;
			Node n = randOperator(depth);
			DecimalFormat numberFormat = new DecimalFormat("#0.0");
			System.out.println(n+" = "+ numberFormat.format(n.eval()));
		}
	}
		
	//creates a binary tree. uses operation nodes picked from a Binop array for the branches and terminates with a Consent. tree size is determined by depth
	private static Node randOperator(int depth)
	{
		Node L,R;
		Random r = new Random();
		if(depth-->0) { L = randOperator(depth); R = randOperator(depth);	}
		else { L = new Const(r.nextInt(20)+1); R = new Const(r.nextInt(20)+1);	}
			
		Binop[] ops = {new Plus(L,R), new Minus(L,R), new Mult(L,R), new Divide(L,R)};
		return ops[r.nextInt(4)];
	}
}