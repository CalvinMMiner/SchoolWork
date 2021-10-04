//this class creates a two dimensional array to be used in TestTwoWayTable to show it works
public class TestTwoWayTable 
{
	public static void main(String[] args) 
	{
		int[][] testArray = {{2, 5, 6, 3}, {9, 4, 4, 7}, {1, 10, 2, 3}, {8, 4, 5, 3} };
		
		TwoWayTable t = new TwoWayTable(testArray);  
		
		System.out.println(t);
	}
}
