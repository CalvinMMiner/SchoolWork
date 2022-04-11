public class RepairVisitor implements Visitor
{
	private static RepairVisitor instance = null;
	private RepairVisitor() {}
	
	public static RepairVisitor getinstance()
	{
		if(instance==null)
			instance = new RepairVisitor();
		return instance;
	}
	
	public void visit(Body b)   {	System.out.println("The body part needs repairs since it cannot " + b.role);	}
	
	public void visit(Engine b)	{	System.out.println("The engine needs repairs since it cannot "    + b.role);	}
	
	public void visit(Wheel b)	{	System.out.println("The wheel needs repairs since it cannot "     + b.role);	}
}
