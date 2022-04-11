/**
 * CSC 402-01 Assignment #4
 * 
 * On my honor, <Your Full Name>, this assignment is my own work.  
 * I, <Your Full Name>, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */

abstract class Stm {
	abstract void prettyprint();
}

class CompoundStm extends Stm {
	Stm stm1, stm2;

	CompoundStm(Stm s1, Stm s2) {
		stm1 = s1;
		stm2 = s2;
	}
	
	void prettyprint() {
		stm1.prettyprint();
		System.out.print(" ; ");
		stm2.prettyprint();
	}
}

class AssignStm extends Stm {
	String id;
	Exp exp;

	AssignStm(String i, Exp e) {
		id = i;
		exp = e;
	}

	void prettyprint() {		
		System.out.print(id);
		System.out.print(" := ");
		exp.prettyprint();		
	}
}

class PrintStm extends Stm {
	ExpList exps;

	PrintStm(ExpList e) {
		exps = e;
	}	

	void prettyprint() {		
		System.out.print("print( ");
		exps.prettyprint();	
		System.out.print(" )");		
	}
}

abstract class Exp {
	abstract void prettyprint();
}

class IdExp extends Exp {
	String id;

	IdExp(String i) {
		id = i;
	}	

	void prettyprint() {		
		System.out.print(id);		
	}
}

class NumExp extends Exp {
	int num;

	NumExp(int n) {
		num = n;
	}
	
	void prettyprint() {		
		System.out.print(num);		
	}
}

class OpExp extends Exp {
	Exp left, right;
	int oper;
	final static int Plus = 1, Minus = 2, Times = 3, Div = 4;

	OpExp(Exp l, int o, Exp r) {
		left = l;
		oper = o;
		right = r;
	}
	
	void prettyprint() {
		left.prettyprint();	
		System.out.print(" ");
		switch(oper) {
		case Plus:
			System.out.print("+");
			break;
		case Minus:
			System.out.print("-");
			break;
		case Times:
			System.out.print("*");
			break;
		case Div:
			System.out.print("/");
			break;
		}
		System.out.print(" ");
		right.prettyprint();
	}
}

class EseqExp extends Exp {
	Stm stm;
	Exp exp;

	EseqExp(Stm s, Exp e) {
		stm = s;
		exp = e;
	}
	
	void prettyprint() {		
		System.out.print("( ");
		stm.prettyprint();
		System.out.print(" , ");
		exp.prettyprint();
		System.out.print(" )");
	}
}

abstract class ExpList {
	abstract void prettyprint();
}

class PairExpList extends ExpList {
	Exp head;
	ExpList tail;

	public PairExpList(Exp h, ExpList t) {
		head = h;
		tail = t;
	}
	
	void prettyprint() {
		head.prettyprint();		
		System.out.print(" , ");
		tail.prettyprint();
	}
}

class LastExpList extends ExpList {
	Exp head;

	public LastExpList(Exp h) {
		head = h;
	}
	
	void prettyprint() {
		head.prettyprint();	
	}
}
