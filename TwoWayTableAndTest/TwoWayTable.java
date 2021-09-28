
public class TwoWayTable
{
	int numRows; 
	int numCols;
	int[][] cell; 
	int[] rowSum;
	int[] colSum;  
	int grandTotal;   
	
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