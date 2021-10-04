//this class takes two doubles and subtracts them for each other
public class Minus extends Binop 
{
	public Minus(Node l, Node r) {super(l, r);}// the nodes that will provide the doubles

	//the method that subtracts the doubles
	public double eval() 
	{
		return lChild.eval() - rChild.eval();
	}
	
	//this returns the toStrings of the branches concatenated with a -
	public String toString()
	{
		return "( " +lChild.toString() + " - "+rChild.toString() +" )";

	}
}