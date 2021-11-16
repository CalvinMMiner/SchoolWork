import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

/**
 *scans a given txt file to generate a array of DataRows
 */
public class DataSet 
{
	/**Reads the provided txt file*/private static Scanner in;
	/** how many n values are in each row*/private int independentVars;
	/**how many rows there are*/private int NumberOfRows;
	/** array to hold all of the rows of data*/private DataRow Rows[];
	
	/**
	 * creates the Scanner reads the number of independent Variables and the number of rows from the txt file
	 * then puts the rest of the file into DataRow's
	 * 
	 * @param DataName the name of the file to be read
	 * @throws FileNotFoundException thrown if the specified file is not found
	 */
	public DataSet(String DataName)throws FileNotFoundException
    {
	    in  = new Scanner(new File(DataName));
	    independentVars = in.nextInt();
	    NumberOfRows = in.nextInt();
	    Rows = new DataRow[NumberOfRows];
	    for(int a = 0; a < NumberOfRows; a++)
	       Rows[a] = new DataRow(in,independentVars);
	}
	
	/**
	 * gets the number of independent Variables
	 * @return the value in independentVars
	 */
	public int GetindependentVars()  { return independentVars; }
	
	/**
	 * gets the number of rows
	 * @return the value in NumberOfRows
	 */
	public int GetNumberOfRows()	 { return NumberOfRows; }
	
	/**
	 * gets a specified row of data
	 * 
	 * @param index  the specific row to be returned
	 * @return the specific DataRow at Rows[index]
	 */
	public DataRow GetRows(int index){ return Rows[index]; }
}
