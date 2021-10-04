//this class takes two doubles and adds them together 
public class Plus extends Binop 
{
	public Plus(Node l, Node r) {super(l, r);}// the nodes that will provide the doubles

	//this is the method that adds to two doubles
	public double eval() 
	{
		return lChild.eval() + rChild.eval();
	}

	//this returns the toStrings of the branches concatenated with a +
	public String toString()
	{
		return "( " +lChild.toString() + " + "+rChild.toString() +" )";

	}
}