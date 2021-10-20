// like const this class holds a value to be used by the other classes, however this value is not  set until eval is called
public class Variable extends Node 
{
	private static int number;//keeps track of how many variables have been created
	private int index;//records the order in which the objects where created  

	//sets index to number  and then increments number to keep track of the order in which this object was created, resets number at 2
	public Variable() 
	{
		index = number;
		number++;
	}
		
	//creates a double, sets it to a value from data, determined by index, and then returns that double. set in a try catch to make sure index is within the bounds of data
	public double eval(double[] data)
	{
		try
		{
			double value=data[index];
			return value;
		}
		catch(Exception E )
		{
			index = index-data.length;
			return eval(data);
		}
	}
	
	//returns X + index to denote the order of creation 
	public String toString()
	{
		return "X"+index;
	}
}
