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
        System.out.println("\n"+s + " = " + root.eval(data));    
	}
}