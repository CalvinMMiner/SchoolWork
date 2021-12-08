/*
Imagine you are developing a software package for Amazon.com
that requires users to enter their own passwords. 
Your software requires that users' passwords meet the following
criteria:
(1) The password should be at least six characters long
(2) The password should contain at least one uppercase and
at least one lowercase letter
(3) The password should have at least one digit
(4) If the password meet the requirement, please display 
"true", otherwise, display "false".
Please write a program and name it homework9_2.java
For example:
Example 1:
input: "1234"
output: false
Example 2: "Abc123!"
output: true
*/
import java.util.Scanner;

public class homework9_2
{
	public static void main(String[] args)
	{
		boolean b = true, c = true, d = true;
		Scanner sc = new Scanner(System.in);
		int total = 0;
	   
		System.out.println("enter a password with more than six characters, uper and lowercase letters and a digit:");
		String text = sc.next();		sc.close();
		if( text.length() >= 6 )
		{
		  for(int a = 0 ; a < text.length(); a++)
		  	{
			  if(Character.isDigit(text.charAt(a)) && b) {b=false; total++;}
			  if(Character.isLowerCase(text.charAt(a)) && c) {c=false; total++;}
			  if(Character.isUpperCase(text.charAt(a)) && d) {d=false; total++;}
		  	}
		  if(total == 3) {System.out.println("true"); System.exit(0);}
		}
		{System.out.println("false");}
	}
}