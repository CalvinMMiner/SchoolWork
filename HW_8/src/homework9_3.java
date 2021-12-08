/*
Balanced strings are those who have equal quantity of "L" and
"R" characters. Given a balanced string s split it in the maximum
amount of balanced strings. Return the maximum amount of splitted
balanced strings
Example 1:
input: "RLRRLLRLRL"
output: 4
Explanation: "RLRRLLRLRL" can be split into "RL", "RRLL", "RL", "RL",
since each substring contains the same number of "L" and R"
Example 2:
input: "RLLLLRRRLR"
output: 3
Explanation: "RLLLLRRRLR" can be split into "RL", "LLLRRR","LR",
since each substring contains the same number of "L" and "R"
Example 3:
input: "LLLLRRRR"
output: 1
Explanation: "LLLLRRRR" can be split into "LLLLRRRR"
Example 4:
input: "RLRRRLLRLL"
output: 2
Explanation: "RLRRRLLRLL" can be split into "RL", "RRRLLRLL",
since each substring contains the same number of "L" and "R"
Please write a program to achieve this goal and name it homework9_3.java
*/
import java.util.Scanner;

public class homework9_3
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int total = 0, equal = 0;
	   
		System.out.println("enter a string of R's and L's:");
		String text = sc.next();		sc.close();

		  for(int a = 0 ; a < text.length(); a++)
		  	{
			  char current = text.charAt(a);
			  equal += (current == 'L' ? -1 : 1);
			  if( equal == 0 ) total++;
		  	}

		  System.out.println(total);

	}
}