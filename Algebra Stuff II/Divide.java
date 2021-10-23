import java.text.DecimalFormat;
//this class takes two doubles and divides them by each other
public class Divide extends Binop 
{
	DecimalFormat numberFormat = new DecimalFormat("#0.0");
	public Divide(Node l, Node r) {super(l, r);}// the nodes that will provide the doubles
	
	public Divide() {}

	//the method that divides the doubles, it also passes down data to be used by variables on the lower branches
	public double eval(double[] data){	return Double.parseDouble(numberFormat.format(lChild.eval(data) / rChild.eval(data)));	}
	
	//this returns the toStrings of the branches concatenated with a /
	public String toString(){	return "(" +lChild.toString() + " / "+rChild.toString() +")";	}
}