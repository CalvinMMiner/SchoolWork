package a1;

import java.util.Stack;

public class harmonic {

	 public static void show_terms(int a)
	 {

			double TotalResult = 0;
			Stack<Double> stack = new Stack<Double>();
	     	while (a > 0) 
	     	{
	     		double currentResult = 0;
	     		TotalResult = TotalResult + (double)1 / a;
	     		stack.push((double)1 / a);
	             a--;
	        }
	 		while(!stack.empty()) {System.out.print(stack.pop() + " + ");}
	 		System.out.print("= " + TotalResult);
			
	       
		}
	public static void main(String [] args)
	{
		
		
 		show_terms(5);
		
       
	}

}
