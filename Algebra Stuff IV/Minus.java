//this class takes two doubles and subtracts them for each other
public class Minus extends Binop 
{
	public Minus(Node l, Node r) {super(l, r);}// the nodes that will provide the doubles

	public Minus() {}

	//the method that subtracts the doubles, it also passes down data to be used by variables on the lower branches
	public double eval(double[] data){
		try	{return lChild.eval(data) - rChild.eval(data);	}
		catch(Exception e) {return 0;}
	}
	
	//this returns the toStrings of the branches concatenated with a -
	public String toString() {
		if(lChild.toString().equals(rChild.toString()))
			return "";
		return "(" +lChild.toString() + " - "+rChild.toString() +")";	}
}