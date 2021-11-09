import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Random;

//This class uses the classes GPTree, OperatorFactory, and TerminalFactory to create and evaluate a random algebra expression 
public class TestAlgebra_IV
{
	static Random r = new Random();//used to ensure the random number are different when called across different methods 
	static int numIndepVars = 3;
	static int maxDepth = 2;
	
    public static void main(String[] args) 
    {
    	Node[] ops = { new Plus(), new Minus(), new Mult(), new Divide() };
    	TerminalFactory t = new TerminalFactory(numIndepVars);
    	OperatorFactory o = new OperatorFactory(ops);
    	GPTree gpt = new GPTree(o, t, maxDepth, r);
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("please enter the name of the data set you want to use: ");
    	String DataName = sc.next();sc.close();
    	try	{	DataSet d = new DataSet(DataName); }  	catch(FileNotFoundException E)	{	System.out.println("file not found"+E);	}
    	
    }
}