/**
 * CSC 402-01 Assignment #3
 * 
 * On my honor, Calvin M Miner, this assignment is my own work.  
 * I, Calvin M Miner, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */

public class Visitor 
{
	private static Visitor instance = null;
	private Visitor() {}
	
	public static Visitor getinstance()
	{
		if(instance==null)
			instance = new Visitor();
		return instance;
	}
	
}
