/**
 * CSC 402-01 Assignment #4
 * 
 * On my honor, <Your Full Name>, this assignment is my own work.  
 * I, <Your Full Name>, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */

class Prog {
	static Stm prog = new CompoundStm(
			new AssignStm("a",
					new OpExp(new NumExp(5), OpExp.Plus,
							new NumExp(3))),
			new CompoundStm(
					new AssignStm("b",
							new EseqExp(
									new PrintStm(new PairExpList(new IdExp("a"),
											new LastExpList(new OpExp(new IdExp("a"), OpExp.Minus, new NumExp(1))))),
									new OpExp(new NumExp(10), OpExp.Times, new IdExp("a")))),
					new PrintStm(new LastExpList(new IdExp("b")))));
}
