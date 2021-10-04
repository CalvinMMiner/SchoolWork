//this class takes two doubles and multiples them together
public class Mult extends Binop 
{
	public Mult(Node l, Node r) {super(l, r);}// the nodes that will provide the doubles

	//the method that multiples the doubles
	public double eval() 
	{
		return lChild.eval() * rChild.eval();
	}
	
	//this returns the toStrings of the branches concatenated with a *
	public String toString()
	{
		return "( " +lChild.toString() + " * "+rChild.toString() +" )";

	}
}