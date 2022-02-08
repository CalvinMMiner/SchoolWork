import java.util.Scanner;
/**
 *this object holds a y value and an array of x value(s) that are accociated with it 
 */
public class DataRow 
{
	/**the y value read from the file*/private double Yvalue;
	/**the array of x values linked to y*/private double[] Xvalues;
	
	public DataRow() {}
	
	/**
	 * takes a passed file, reads in the y value, then uses NumberOfX to read the correct amount of x values
	 * 
	 * @param in linked to the file holding the data to be copied
	 * @param NumberOfX how many x values should be read into this object
	 */
	public DataRow(Scanner in, int NumberOfX) 
	{
		Yvalue=in.nextDouble();
		Xvalues = new double[NumberOfX];
		for(int a = 0; a < NumberOfX; a++)
			Xvalues[a] = in.nextDouble();
        
	}
	
	/**
	 * gets the y value
	 * 
	 * @return the value in Yvalue
	 */
	public double getY() {	return Yvalue;	}
	
	/**
	 * gets all of the x values
	 * 
	 * @return the whole array  of Xvalues
	 */
	public double[] getX() {	return Xvalues;	}
	
	/**
	 * gets a specific value from the array Xvalues
	 * 
	 * @param index a specific position in Xvalues
	 * @return the specified value from Xvalues
	 */
	public double getX(int index) {	return Xvalues[index];	}

	
}
