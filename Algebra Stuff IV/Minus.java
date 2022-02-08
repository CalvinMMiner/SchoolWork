/**
 * this class takes two doubles and subtracts them for each other
 */
public class Minus extends Binop 
{
	/**
	 * sets the two child nodes to the given node derivative 
	 * @param l the child node node on the "left"
	 * @param r the child node node on the "right"
	 */
	public Minus(Node l, Node r) {super(l, r);}

	public Minus() {}

	/**
	 * subtracts the provided doubles, it also passes down data to be used by variables at the end of the tree
	 * 
	 * @param data the array of values that variable will use
	 * @return the left child minus the right child
	 */
	public double eval(double[] data){
		return lChild.eval(data) - rChild.eval(data);
	}
	
	/**
	 * @return this returns the toStrings of the branches concatenated with a - and surrounded by ()
	 * shortens to a blank space if the child nodes are identical since negitive values are currenty imposible
	 */
	public String toString() {
		if(lChild.toString().equals(rChild.toString()))
			return "";
		return "(" +lChild.toString() + " - "+rChild.toString() +")";	}
}