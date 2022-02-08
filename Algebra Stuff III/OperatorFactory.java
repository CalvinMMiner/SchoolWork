import java.util.Random;

public class OperatorFactory 
{
	private Node[] currentOps;//used to store the list of Avadible operations
	
	//basic constructor that moves the given array of nodes into currentOps
	OperatorFactory(Node[] n){	currentOps = n;	}
	
	//returns a random operator 
	public Node getOperator(Random rand){	return (Node) currentOps[rand.nextInt(currentOps.length)].clone();	}
	
	//returns the number of operations avadible
	public int getNumOps(){	return currentOps.length;	}
}	