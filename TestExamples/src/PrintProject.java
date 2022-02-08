public class PrintProject 
{
	public static void main(String [] args)
	{
		
		generalizedHalf(1,5,1);
		generalizedHalf(4,0,-1);
	}
	
	/* a method that uses a for loop to call the methods to print a row of a graphic several times, based on the given variables
	 * when provided a start larger than stop and a negative direction a top that starts wide and narrows is created
	 * a smaller top and positive direction produce the opposite result. a larger start in the positive direction will produce a infinite loop, same as smaller and negative */
	public static void generalizedHalf(int start, int stop, int direction)
	{
		int limit;
		if(start<=stop) 
		{
			limit=stop;
			line(limit);
		}
		else {limit=start;}
		for( int line = start; line != stop; line += direction )
			{
				
				System.out.print("|");
				space(line, limit);
				diamond();
				dot(line);
				diamond();
				space(line, limit);
				System.out.println("|");
			}
		if(start>=stop) {line(limit+1);}
	}
	
	/**public static void topHalf()
	{
		for(int line = 1; line <= 4; line++)
			meat(line);
	}
	
	public static void bottomHalf()
	{
		for(int line = 4; line >= 1; line--)
			meat(line);
	}
	
	public static void meat(int line)
	{
		System.out.print("|");
		space(line);
		diamond();
		dot(line);
		diamond();
		space(line);
		System.out.println("|");
	}*/
	public static void diamond()
	{
		System.out.print("<>");
	}
	
	public static void space(int line, int limit)
	{
		for ( int space = 1; space <= (line * -1 + 5); space++ ) 
			System.out.print("  ");	
	}
	//methods that use a provided int to run a for loop to print a specific number of spacer characters, be they dots or actual spaces 
	public static void dot(int line)
	{
		for ( int dot = 1; dot <= (line - 1); dot++ ) 
			System.out.print("....");
	}
	public static void line(int limit)
	{
		System.out.print("#");
		for ( int dot = 0; dot <= (limit*4-1); dot++ ) 
			System.out.print("=");
		System.out.println("#");
	}
}
