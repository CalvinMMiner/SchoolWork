import java.util.Random;

public class GPTree 
{    
	private Node root;    
	//private int mySize; not used in current version   
	
	GPTree() { root = null; }    
	GPTree(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) { root = o.getOperator(rand); root.addRandomKids(o, t, maxDepth, rand); }
	
	//trio of methods that tells root to use the corresponding method
	public String toString() { return root.toString(); }
	public double eval(double[] data) { return root.eval(data); }    
	public int mySize() { return root.mySize(); }
	
	public double eval(DataSet data)
	{
		double TotalFitness = 0;
		for(int a = 0; a < data.GetNumberOfRows(); a++)
		{
			double b = ( this.eval( data.GetRows(a).getX() ) - data.GetRows(a).getY()	);
			TotalFitness += b*b;
		}
		return TotalFitness;
	}
}