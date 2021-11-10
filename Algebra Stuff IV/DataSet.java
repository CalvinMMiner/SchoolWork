import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class DataSet 
{
	private static Scanner in;
	private int independentVars;
	private int NumberOfRows;
	public DataRow Rows[];
	
	public DataSet(String DataName)throws FileNotFoundException
    {
	       in  = new Scanner(new File(DataName));
	       independentVars = in.nextInt();
	       NumberOfRows = in.nextInt();
	       Rows = new DataRow[NumberOfRows];
	       for(int a = 0; a < NumberOfRows; a++)
	    	   Rows[a] = new DataRow(in,independentVars);
	}
	
	public int GetindependentVars() { return independentVars; }
	public int GetNumberOfRows()	{ return NumberOfRows; }
	public DataRow GetRows(int index)		{ return Rows[index]; }
	
	/**
	public void Print()
	{
		System.out.print(independentVars + " " + NumberOfRows);
		for(int a = 0; a < NumberOfRows; a++)
	       {
				System.out.print("\n" + Rows[a].getY());
				for(int b = 0; b < independentVars; b++)
				{
					System.out.print(" " + Rows[a].getX(b));
				}
	       }
	}*/
}
