import java.util.Random;

/**
 *uses  OperatorFactory and TerminalFactory to generate a node holding a algebra expression, 
 *then provides methods to manipulate and access the data held by that node
 */
public class GPTree 
{    
	/** holds the tree this class generates*/private Node root;    

	GPTree() { root = null; }  
	/**
	 * sets root to a random operation then calls addRandomKids to create a algebra expression
	 * 
	 *@param o a object that gives a random operator
	 *@param t a object that gives a random constant or variable
	 *@param maxDepth the maximum allowed number of child nodes beneath the root node
	 *@param rand a static random to be used for the generation of the expression
	 */
	GPTree(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) { root = o.getOperator(rand); root.addRandomKids(o, t, maxDepth, rand); }
	
	/**
	 * calls roots .toString() method
	 * 
	 * @return the expression held in root
	 */
	public String toString() { return root.toString(); }
	
	/**
	 * calls roots .eval() method
	 * 
	 * @param data the array of values variable can use
	 * @return the calculated result of the expression held in root
	 */
	public double eval(double[] data) { return root.eval(data); }   
	
	/**
	 * calls roots .mySize() method
	 * @return how many nodes are in root
	 */
	public int mySize() { return root.mySize(); }
	
	/**
	 * takes in a data set, runs each row a data through the .eval() method and then calculates the fitness
	 * 
	 * @param data holds a number of data rows that will be evaluated
	 * @return the fitness of the expression held in root
	 */
	public double eval(DataSet data)
	{
		double TotalFitness = 0;
		for(int a = 0; a < data.GetNumberOfRows(); a++)
		{
			double b = ( this.eval( data.GetRows(a).getX() ) - data.GetRows(a).getY()	);
			TotalFitness += b*b;
		}
		return TotalFitness;
	}
}