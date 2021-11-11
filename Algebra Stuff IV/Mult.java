//this class takes two doubles and multiples them together
public class Mult extends Binop 
{
	public Mult(Node l, Node r) {super(l, r);}// the nodes that will provide the doubles

	public Mult() {}

	//the method that multiples the doubles, it also passes down data to be used by variables on the lower branches
	public double eval(double[] data){
		try	{return lChild.eval(data) * rChild.eval(data);	}
		catch(Exception e) {System.out.println("ops");return 0;}
	}
	
	//this returns the toStrings of the branches concatenated with a *
	public String toString()
	{
		if(lChild.toString().equals(rChild.toString()))
			return lChild.toString() + "^2";
		return "(" +lChild.toString() + " * "+rChild.toString() +")";	
	}
}