import java.util.*;
/**
 * create a container of GPTrees
 */
public class Generation {
	/**how many trees should be created*/private int numTrees;
	/**array to hold the trees*/private GPTree[] population;
	/**array to hold the fitness values of each tree*/private double[] fitness;
	
	/**
	 * Specifies the number of GPTrees in this generations, the 
	 * factories used to generate the individual trees, the maximum
	 * tree depth, and the Random object used.
	 * 
	 *@param numTrees how many trees should be generated
	 *@param o a object that gives a random operator
	 *@param t a object that gives a random constant or variable
	 *@param m the maximum allowed number of child nodes beneath the root node
	 *@param r a static random to be used for the generation of the expression
	 */
	Generation(int numTrees, OperatorFactory o, TerminalFactory t, int m, Random r){
		this.numTrees = numTrees;
		population = new GPTree[numTrees];
		fitness = new double[numTrees];
		for(int i = 0; i<numTrees; i++)
			population[i] = new GPTree(o,t,m,r);
	}
	
	/**
	 * Specifies the number of GPTrees in this generations and nothing else
	 * @param n how many trees should be generated 
	 */
	Generation(int n){
		numTrees = n;
		population = new GPTree[numTrees];
		fitness = new double[numTrees];
	}
	
	/**
	 * evaluate each tree in this generation, and set each tree's fitness value
	 * 
	 * @param data the data that will be passed onto the variable nodes
	 */
	public void evalAll(DataSet data){
		for(int i = 0;i<numTrees;i++)
			fitness[i] = population[i].eval(data);
	}
	
	/**
	 * gets a specific tree from the population array
	 * 
	 * @param i the desired tree
	 * @return the tree specified by i
	 */
	public GPTree getTree(int i){
		return population[i];
	}
	
	/**
	 * once the trees have been evaluated the method finds the one with the best fitness
	 * by using clone, Array.sort(), and a for loop
	 */
	public void printBestTree(){
		int i = 0;
		double[] tempFitness = fitness.clone();
		
		Arrays.sort(tempFitness);; //sort the cloned array
		while(tempFitness[0]!=fitness[i])//find the smallest value within fitness[]
			i++;
		System.out.println(population[i]);
		System.out.println("The smallest fitness is "+tempFitness[0]);
	}
	
	/**
	 * gets the number of trees in this generation
	 * @return the int in numTrees
	 */
	public int getNumTrees() {
		return numTrees;
	}
	
	/**
	 * prints the expression of every tree in the population array
	 */
	public void printGeneration(){
		for(int i = 0; i<numTrees;i++){
			System.out.println(population[i]);
		}
	}
}
