import java.util.Random;
import java.text.DecimalFormat;

public class TestArithmetic 
{
	static Random r = new Random();

	public static void main(String[] args) 
	{
		for(int i =0;i<5;i++)
		{
			Node n = (Node) randOperator();
			DecimalFormat numberFormat = new DecimalFormat("#0.0");
			System.out.println(n+" = "+ numberFormat.format(n.eval()));
		}

	}
	
	private static Node randOperator()
	{
		switch(r.nextInt(4))
		{
			case 0: Plus  p = new Plus(	randOperator1(),randOperator1()); return p;
			case 1: Minus m = new Minus(randOperator1(),randOperator1()); return m;
			case 2: Mult  M = new Mult(	randOperator1(),randOperator1()); return M;
			case 3:Divide d =new Divide(randOperator1(),randOperator1()); return d;
		}
		
		return null;
	}
	
	private static Node randOperator1()
	{
		switch(r.nextInt(4))
		{
			case 0: Plus  p = new Plus(	new Const(r.nextInt(20)+1), new Const(r.nextInt(20)+1)); return p;
			case 1: Minus m = new Minus(new Const(r.nextInt(20)+1), new Const(r.nextInt(20)+1)); return m;
			case 2: Mult  M = new Mult(	new Const(r.nextInt(20)+1), new Const(r.nextInt(20)+1)); return M;
			case 3:Divide d =new Divide(new Const(r.nextInt(20)+1), new Const(r.nextInt(20)+1)); return d;
		}
		
		return null;
	}
}
