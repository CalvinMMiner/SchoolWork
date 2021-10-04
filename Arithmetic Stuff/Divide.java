//this class takes two doubles and divides them by each other
public class Divide extends Binop 
{
	public Divide(Node l, Node r) {super(l, r);}// the nodes that will provide the doubles
	
	//the method that divides the doubles
	public double eval() 
	{
		return lChild.eval() / rChild.eval();
	}
	
	//this returns the toStrings of the branches concatenated with a /
	public String toString()
	{
		return "( " +lChild.toString() + " / "+rChild.toString() +" )";

	}
}