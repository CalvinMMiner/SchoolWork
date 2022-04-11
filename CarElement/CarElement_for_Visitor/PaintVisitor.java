public class PaintVisitor implements Visitor
{
	private static PaintVisitor instance = null;
	private PaintVisitor() {}
	
	public static PaintVisitor getinstance()
	{
		if(instance==null)
			instance = new PaintVisitor();
		return instance;
	}
	
	public void visit(Body q)   {	System.out.println("The body part was painted in " + q.color);	}
	
	public void visit(Engine q) {	System.out.println("The engine was painted in "    + q.color);  }
	
	public void visit(Wheel q) 	{	System.out.println("The wheel was painted in "     + q.color);  }

}
