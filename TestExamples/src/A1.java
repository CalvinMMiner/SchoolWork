/**
 * CSC 402-01 Assignment #1
 * 
 * On my honor, <Calvin M Miner>, this assignment is my own work.  
 * I, <Calvin M Miner>, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */

public class A1 {
    
    // Do NOT change the following line.
    public static int SIZE = 3;

    public static void main(String[] args) {

        // Do NOT change the following two lines.
        if(args.length > 0 && args[0] != null)
            SIZE = Integer.parseInt(args[0]);

        //---------------------------------------------------------------------
        // Fill in your code here
        printTop();
        printMiddle();
        printBase();
        //
        //---------------------------------------------------------------------
    }

    //---------------------------------------------------------------------
    // Fill in your code here

    // You are not allowed to use anything besides println/print statements, 
    // static methods, method calls, loops, nested loops, local variables, and class constants.
    
    // You are NOT allowed to use method parameters, methods that return values, or 
    // conditional statements (i.e., if, if/else statements).
    
    public static void printBreak()
    {
    	System.out.println();
    }
    
    //----------code for printing the top portion----------------------------
    public static void printTop()
    {
    	printHashLine();
    	printTopLineType2();
    	printHashLine();
    }
    
    /**public static void printTopLineType1()
    {
    	printDotsPlus();
    	printHash();
    	printDotsPlus();
    	printBreak();
    }*/
    
    public static void printTopLineType2()
    {
    	for ( int dot = 1; dot <= (SIZE*2-2); dot++ ) 
    	{
    		printDotsPlus();
    		printColon();
    		printDotsPlus();
    		printBreak();
    	}
    }
        
    public static void printDotsPlus()
    {
		System.out.print("..");
		printDots();
    }
    
    public static void printHashLine()
    {
    	printDotsPlus();
    	for ( int dot = 0; dot <= (SIZE*2-2); dot++ )
			System.out.print("#");
    	printDotsPlus();
    	printBreak();
    }
    
    public static void printColon()
    {
    	for ( int dot = 0; dot <= (SIZE*2-2); dot++ )
			System.out.print(":");
    }
    
  //----------code for printing the Middle portion----------------------------
    
    public static void printMiddle()
    {
    	for ( int dot = 1; dot <= ((SIZE*SIZE)-2); dot++ )
    	{
    		printMiddleTildaLine();
    		printMiddlePatternLine();
    	}
    	printMiddleTildaLine();
    }
    
    public static void printMiddleTildaLine()
    {
    	printDots();
    	printTilda();
    	printDots();
    	printBreak();
    }
    
    public static void printMiddlePatternLine()
    {
    	printDots();
    	printMiddlePattern();
    	printDots();
    	printBreak();
    }
    
    public static void printDots()
    {
    	for ( int dot = 1; dot <= (SIZE*2); dot++ ) 
			System.out.print("..");
    }
    
    public static void printTilda()
    {
    	for ( int dot = 0; dot <= (SIZE*2+2); dot++ )
			System.out.print("~");
    }
    
    public static void printMiddlePattern()
    {
    	System.out.print("|");
    	for ( int dot = 1; dot <= (SIZE); dot++ )
			System.out.print("-@");
    	System.out.print("-|");
    }
    
  //----------code for printing the base portion----------------------------
    
    public static void printBase()
    {
    	for ( int dot = 1; dot <= (SIZE); dot++ )
    	{
    		System.out.print("/");
    		for ( int bot = 0; bot <= (SIZE*5-1); bot++ )
    			System.out.print("\"#");
    		System.out.print("\"\\\n");
    	}
    }
    
    //
    //---------------------------------------------------------------------
}