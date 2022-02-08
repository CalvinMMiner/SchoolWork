/**
 * this class takes two doubles and multiples them together
 */
public class Mult extends Binop 
{
	/**
	 * sets the two child nodes to the given node derivative 
	 * @param l the child node node on the "left"
	 * @param r the child node node on the "right"
	 */
	public Mult(Node l, Node r) {super(l, r);}

	public Mult() {}

	/**
	 * multiples the provided doubles, it also passes down data to be used by variables at the end of the tree
	 * 
	 * @param data the array of values that variable will use
	 * @return left child times right child
	 */
	public double eval(double[] data){
		return lChild.eval(data) * rChild.eval(data);
	}
	
	/**
	 * @return this returns the toStrings of the branches concatenated with a * and surrounded by ()
	 * shortens to lChild squared if the child nodes are identical
	 */
	public String toString()
	{
		if(lChild.toString().equals(rChild.toString()))
			return lChild.toString() + "^2";
		return "(" +lChild.toString() + " * "+rChild.toString() +")";	
	}
}