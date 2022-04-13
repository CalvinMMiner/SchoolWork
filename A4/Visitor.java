/**
 * CSC 402-01 Assignment #4
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
	
	void visit(CompoundStm stm) 
	{
		stm.stm1.accept(Visitor.getinstance());
		System.out.print(" ; ");
		stm.stm2.accept(Visitor.getinstance());
	}
	
	void visit(AssignStm stm) 
	{		
		System.out.print(stm.id);
		System.out.print(" := ");
		stm.exp.accept(Visitor.getinstance());		
	}
	
	void visit(PrintStm stm) 
	{		
		System.out.print("print( ");
		stm.exps.accept(Visitor.getinstance());	
		System.out.print(" )");		
	}
	
	void visit(IdExp stm) {	System.out.print(stm.id);	}
	
	void visit(NumExp stm) {	System.out.print(stm.num);	}
	
	void visit(OpExp stm) 
	{
		stm.left.accept(Visitor.getinstance());	
		System.out.print(" ");
		if (stm.oper == stm.Plus) 		{	System.out.print("+");	}
		else if (stm.oper == stm.Minus) {	System.out.print("-");	} 
		else if (stm.oper == stm.Times) {	System.out.print("*");	} 
		else 						 	{	System.out.print("/");	}
		System.out.print(" ");
		stm.right.accept(Visitor.getinstance());
	}

	void visit(EseqExp stm) 
	{		
		System.out.print("( ");
		stm.stm.accept(Visitor.getinstance());
		System.out.print(" , ");
		stm.exp.accept(Visitor.getinstance());
		System.out.print(" )");
	}
	
	void visit(PairExpList stm) 
	{
		stm.head.accept(Visitor.getinstance());		
		System.out.print(" , ");
		stm.tail.accept(Visitor.getinstance());
	}
	
	void visit(LastExpList stm) {	stm.head.accept(Visitor.getinstance());	}
}
