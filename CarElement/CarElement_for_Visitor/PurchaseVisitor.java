public class PurchaseVisitor implements Visitor
{
	private static PurchaseVisitor instance = null;
	private PurchaseVisitor() {}
	
	public static PurchaseVisitor getinstance()
	{
		if(instance==null)
			instance = new PurchaseVisitor();
		return instance;
	}
	
	public void visit(Body p) 	{	System.out.println("The body part was purchased in " + p.year);	}

	public void visit(Engine p) {	System.out.println("The engine was purchased in "    + p.year);	}

	public void visit(Wheel p)  {	System.out.println("The wheel was purchased in "     + p.year); }

}
