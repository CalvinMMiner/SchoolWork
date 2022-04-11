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
	
	public void visit(Circle C) 
	{	System.out.println("draw() in Circle");	}
	
	public void visit(Square S) 
	{	System.out.println("draw() in Square");	}
	
	public void visit(Triangle T) 
	{	System.out.println("draw() in Triangle");	}
}
