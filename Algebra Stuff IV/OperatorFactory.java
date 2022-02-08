import java.util.Random;
/**
 * this object returns a random operation
 */
public class OperatorFactory 
{
	/**holds the operations that can be randomly selected */private Node[] currentOps;
	
	/**
	 * basic constructor that moves the given array of nodes into currentOps
	 * 
	 * @param n the list of avadible operations
	 */
	OperatorFactory(Node[] n){	currentOps = n;	}
	
	/**
	 * returns a random operator 
	 * 
	 * @param rand passed random to assign the operation
	 * @return a randomly chosen operation
	 */
	public Node getOperator(Random rand){	return (Node) currentOps[rand.nextInt(currentOps.length)].clone();	}
	
	/**
	 * returns the number of operations avadible
	 * @return the number of operation in the currentOps array
	 */
	public int getNumOps(){	return currentOps.length;	}
}	