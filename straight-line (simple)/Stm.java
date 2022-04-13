abstract class Stm {}

class CompoundStm extends Stm 
{
	Stm stm1, stm2;

	CompoundStm(Stm s1, Stm s2)
	{
		stm1 = s1;
		stm2 = s2;
	} 
}

class AssignStm extends Stm 
{
	String id;
	Exp exp;

	AssignStm(String i, Exp e) 
	{
		id = i;
		exp = e;
	} 
}

class PrintStm extends Stm 
{
	Exp exp;

	PrintStm(Exp e) {	exp = e;	}	 
}

abstract class Exp {	abstract void prettyprint();	}

class IdExp extends Exp 
{
	String id;

	IdExp(String i) {	id = i;	}

	void prettyprint() {}	 
}

class NumExp extends Exp {
	int num;

	NumExp(int n) {
		num = n;
	}


	void prettyprint() {}
	 
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


	void prettyprint() {} 
}