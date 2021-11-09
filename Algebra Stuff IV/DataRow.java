import java.util.Scanner;
public class DataRow 
{
	private double Yvalue;
	private double[] Xvalues;
	
	public DataRow() {}
	
	public DataRow(Scanner in, int NumberOfX) 
	{
		Yvalue=in.nextDouble();
		Xvalues = new double[NumberOfX];
		for(int a = 0; a < NumberOfX; a++)
        {
			Xvalues[a] = in.nextDouble();
        }
	}
	
	//standard set of get methods for the variables Yvale and Xvalues
	public double getY() {	return Yvalue;	}
	public double[] getX() {	return Xvalues;	}
	public double getX(int index) {	return Xvalues[index];	}

	
}
