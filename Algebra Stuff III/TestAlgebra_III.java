import java.util.Random;

//This class uses the classes GPTree, OperatorFactory, and TerminalFactory to create and evaluate a random algebra expression 
public class TestAlgebra_III
{
	static Random r = new Random();//used to ensure the random number are different when called across different methods 
	static int numIndepVars = 3;
	static int maxDepth = 5;
	
    public static void main(String[] args) 
    {
    	double[] data = { 3.14, 2.78, 1.0 };
    	Node[] ops = { new Plus(), new Minus(), new Mult(), new Divide() };
    	OperatorFactory o = new OperatorFactory(ops);
    	TerminalFactory t = new TerminalFactory(numIndepVars);
    	GPTree gpt = new GPTree(o, t, maxDepth, r);
    	System.out.println( gpt + " = " + gpt.eval(data) + " the size is: " + gpt.mySize() );    
    }
}