//this class takes in a two dimensional array and calculates the row Sum, column Sum, and grand Total, then prints it out in a formated fashion 
public class TwoWayTable
{
	int numRows; 
	int numCols;
	int[][] cell; 
	int[] rowSum;
	int[] colSum;  
	int grandTotal;   
	
	//takes a two dimensional array and uses it to set a number of variables for internal use
	TwoWayTable(int[][] data)
	{
		cell = new int[data.length][data.length];
		rowSum = new int[data.length];
		colSum = new int[data.length];
		
		for(int i=0; i<data.length; i++)
		{
			for(int o=0; o<data[i].length; o++)
			{
				cell[i][o] =data[i][o]; 
			}
		}
		setMargins();
	}
	
	//this method calculates the row Sum, column Sum, and grand Total and sets the respective variables 
	void setMargins()
	{       
		for(int i=0; i<cell.length; i++)
		{
			numRows = 0;
			numCols = 0;
			for(int o=0; o<cell[i].length; o++)
			{
				numRows += cell[i][o];
				numCols += cell[o][i];
			}
			grandTotal += numRows;
			rowSum[i] = numRows;
			colSum[i] = numCols;
		}
	}
	
	//this prints out the two dimensional array with additional formating and the row Sum, column Sum, and grand Total
	public String toString()
	{
		String text = "";
		for(int i=0; i<cell.length; i++)
		{
			for(int o=0; o<cell.length; o++)
			{
				text += cell[i][o] + (cell[i][o]<10 ?"  ": " "); 
				if(o==cell.length-1) text += "| "+ rowSum[i] + "\n";
			}
			
			if(i==cell.length-1) 
			{
				for(int o=0; o<cell.length; o++)
				{
					text+="---";
				}
				text+="\n";
				for(int o=0; o<cell.length; o++)
				{
					text+=colSum[o] + " ";
				}
				text+="| "+ grandTotal;
			}
		}
		
		return text;
	}
	
}