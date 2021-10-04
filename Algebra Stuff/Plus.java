//this class takes two doubles and adds them together 
public class Plus extends Binop 
{
	public Plus(Node l, Node r) {super(l, r);}// the nodes that will provide the doubles

	//this is the method that adds to two doubles, it also passes down data to be used by variables on the lower branches
	public double eval(double[] data) 
	{
		return lChild.eval(data) + rChild.eval(data);
	}
	
	//this returns the toStrings of the branches concatenated with a +
	public String toString()
	{
		return "( " +lChild.toString() + " + "+rChild.toString() +" )";

	}
}