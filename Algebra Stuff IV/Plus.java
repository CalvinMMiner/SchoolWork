/**
 * this class takes two doubles and adds them together 
 */
public class Plus extends Binop 
{
	/**
	 * sets the two child nodes to the given node derivative 
	 * @param l the child node node on the "left"
	 * @param r the child node node on the "right"
	 */
	public Plus(Node l, Node r) {super(l, r);}

	public Plus() {}

	/**
	 * adds the provided doubles, it also passes down data to be used by variables at the end of the tree
	 * 
	 * @param data the array of values that variable will use
	 * @return the left child plus the right child
	 */
	public double eval(double[] data){
		return lChild.eval(data) + rChild.eval(data);
	}
	
	/**
	 * @return this returns the toStrings of the branches concatenated with a 2 and surrounded by ()
	 * shortens to 2(lChild) if the child nodes are identical
	 */
	public String toString(){
		if(lChild.toString().equals(rChild.toString()))
			return "2(" + lChild.toString() + ")";
		return "(" +lChild.toString() + " + "+rChild.toString() +")";	}
}