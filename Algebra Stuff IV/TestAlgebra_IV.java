import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Random;

/**
 * This class uses the classes OperatorFactory, TerminalFactory, and Generation to create a number of expressions
 * the find the one with the best fitness 
 * 
 * @author Calvin M Miner
 *
 */
public class TestAlgebra_IV {
	/**used to ensure the random numbers are different when called across different methods*/static Random r = new Random(); 
	/**the number of independent variables, to be used in TerminalFactory*/static int numIndepVars = 3;
	
	/**
	 * creates the TerminalFactory,OperatorFactory, and Generation, and Scanner objects that will be used to create a number of trees to find the best fitness
	 */
    public static void main(String[] args) {
    	Node[] ops = { new Plus(), new Minus(), new Mult(), new Divide() };
    	TerminalFactory t = new TerminalFactory(numIndepVars);
    	OperatorFactory o = new OperatorFactory(ops);
    	Generation g = new Generation(500,o,t,4,r);
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("please enter the name of the data set you want to use: ");
    	String DataName = sc.next();sc.close();
    	try
    	{
    		DataSet d = new DataSet(DataName); 
    		g.evalAll(d);	g.printBestTree();
    	}  	
    	catch(FileNotFoundException E)	{	System.out.println(E);	}
    	
    }
}