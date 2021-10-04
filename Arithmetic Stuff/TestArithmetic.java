import java.util.Random;
import java.text.DecimalFormat;

//This class uses Node and its descendants to perform some basic Arithmetic with { + - * / }
public class TestArithmetic 
{
	static Random r = new Random();//used to randomize the classes and constants

	//the main method uses the methods randOperator and randOperator1 to generate the Arithmetic expressions
	public static void main(String[] args) 
	{
		for(int i =0;i<5;i++)
		{
			Node n = (Node) randOperator();
			DecimalFormat numberFormat = new DecimalFormat("#0.0");
			System.out.println(n+" = "+ numberFormat.format(n.eval()));
		}

	}
		
	//Determines which operation is in the middle
	private static Node randOperator()
	{
		switch(r.nextInt(4))
		{
			case 0: Plus  p = new Plus  (randOperator1(),randOperator1()); return p;
			case 1: Minus m = new Minus (randOperator1(),randOperator1()); return m;
			case 2: Mult  M = new Mult  (randOperator1(),randOperator1()); return M;
			case 3:Divide d = new Divide(randOperator1(),randOperator1()); return d;
		}
				
		return null;
	}
	
	//Determines which operations happen on the sides and what the numbers involved are
	private static Node randOperator1()
	{
		switch(r.nextInt(4))
		{
			case 0: Plus  p = new Plus  (new Const(r.nextInt(20)+1), new Const(r.nextInt(20)+1)); return p;
			case 1: Minus m = new Minus (new Const(r.nextInt(20)+1), new Const(r.nextInt(20)+1)); return m;
			case 2: Mult  M = new Mult  (new Const(r.nextInt(20)+1), new Const(r.nextInt(20)+1)); return M;
			case 3:Divide d = new Divide(new Const(r.nextInt(20)+1), new Const(r.nextInt(20)+1)); return d;
		}
				
		return null;
	}
}

/* LOOK AT THIS ABOMINATION I STATRED TO MAKE. boy am I glad I took a break and found a better way
	Node a;
	switch(r.nextInt(16))
	{
		case 0: a = new Plus(new Plus(		new Const(r.nextInt(20)+1),	new Const(r.nextInt(20)+1)),	new Plus(new Const(r.nextInt(20)+1), 	new Const(r.nextInt(20)+1)));break;
		case 1: a = new Plus(new Plus(		new Const(r.nextInt(20)+1),	new Const(r.nextInt(20)+1)),	new Minus(new Const(r.nextInt(20)+1), 	new Const(r.nextInt(20)+1)));break;
		case 2: a = new Plus(new Plus(		new Const(r.nextInt(20)+1),	new Const(r.nextInt(20)+1)),	new Mult(new Const(r.nextInt(20)+1), 	new Const(r.nextInt(20)+1)));break;
		case 3: a = new Plus(new Plus(		new Const(r.nextInt(20)+1),	new Const(r.nextInt(20)+1)),	new Divide(new Const(r.nextInt(20)+1), 	new Const(r.nextInt(20)+1)));break;
		case 4: a = new Plus(new Minus(		new Const(r.nextInt(20)+1),	new Const(r.nextInt(20)+1)),	new Plus(new Const(r.nextInt(20)+1), 	new Const(r.nextInt(20)+1)));break;
		case 5: a = new Plus(new Minus(		new Const(r.nextInt(20)+1),	new Const(r.nextInt(20)+1)),	new Minus(new Const(r.nextInt(20)+1),	new Const(r.nextInt(20)+1)));break;
		case 6: a = new Plus(new Minus(		new Const(r.nextInt(20)+1),	new Const(r.nextInt(20)+1)),	new Mult(new Const(r.nextInt(20)+1),	new Const(r.nextInt(20)+1)));break;
		case 7: a = new Plus(new Minus(		new Const(r.nextInt(20)+1),	new Const(r.nextInt(20)+1)),	new Divide(new Const(r.nextInt(20)+1),	new Const(r.nextInt(20)+1)));break;
		case 8: a = new Plus(new Mult(		new Const(r.nextInt(20)+1),	new Const(r.nextInt(20)+1)),	new Plus(new Const(r.nextInt(20)+1), 	new Const(r.nextInt(20)+1)));break;
		case 9: a = new Plus(new Mult(		new Const(r.nextInt(20)+1),	new Const(r.nextInt(20)+1)),	new Minus(new Const(r.nextInt(20)+1), 	new Const(r.nextInt(20)+1)));break;
		case 10:a = new Plus(new Mult(		new Const(r.nextInt(20)+1),	new Const(r.nextInt(20)+1)),	new Mult(new Const(r.nextInt(20)+1), 	new Const(r.nextInt(20)+1)));break;
		case 11:a = new Plus(new Mult(		new Const(r.nextInt(20)+1),	new Const(r.nextInt(20)+1)),	new Divide(new Const(r.nextInt(20)+1),	new Const(r.nextInt(20)+1)));break;
		case 12:a = new Plus(new Divide(	new Const(r.nextInt(20)+1), new Const(r.nextInt(20)+1)),	new Plus(new Const(r.nextInt(20)+1),	new Const(r.nextInt(20)+1)));break;
		case 13:a = new Plus(new Divide(	new Const(r.nextInt(20)+1), new Const(r.nextInt(20)+1)),	new Minus(new Const(r.nextInt(20)+1),	new Const(r.nextInt(20)+1)));break;
		case 14:a = new Plus(new Divide(	new Const(r.nextInt(20)+1), new Const(r.nextInt(20)+1)),	new Mult(new Const(r.nextInt(20)+1), 	new Const(r.nextInt(20)+1)));break;
		case 15:a = new Plus(new Divide(	new Const(r.nextInt(20)+1), new Const(r.nextInt(20)+1)),	new Divide(new Const(r.nextInt(20)+1), 	new Const(r.nextInt(20)+1)));break;
		
		default: a = new Plus(new Plus(new Const(r.nextInt(20)+1), new Const(r.nextInt(20)+1)),	new Minus(new Const(r.nextInt(20)+1), new Const(r.nextInt(20)+1)));
	}
	*/