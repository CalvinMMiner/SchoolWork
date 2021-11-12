import java.text.DecimalFormat;
/**
 * this class takes two doubles and divides them by each other
 */
public class Divide extends Binop 
{
	/**DecimalFormat used to clean up the result of the division*/DecimalFormat numberFormat = new DecimalFormat("#0.0");
	
	/**
	 * sets the two child nodes to the given node derivative 
	 * @param l the child node node on the "left"
	 * @param r the child node node on the "right"
	 */
	public Divide(Node l, Node r) {super(l, r);}
	
	public Divide() {}

	/**
	 * divides the provided doubles and formats the result to a maximum of 1 decimal place, it also passes down data to be used by variables at the end of the tree
	 * includes a try catch to stop... something from breaking the code
	 * 
	 * @param data the array of values that variable will use
	 * @return the value of the left child divided by the right child, or 1 if the exception occurs 
	 */
	public double eval(double[] data)
	{
		try {return Double.parseDouble(numberFormat.format(lChild.eval(data) / rChild.eval(data)));}	
		
		catch(Exception e) {return 1;}
	}
	
	/**
	 * @return this returns the toStrings of the branches concatenated with a / and surrounded by ()
	 * shortens to 1 if the child nodes are identical
	 */
	public String toString(){
		if(lChild.toString().equals(rChild.toString()))
			return "1";
		return "(" +lChild.toString() + " / "+rChild.toString() +")";	}
}