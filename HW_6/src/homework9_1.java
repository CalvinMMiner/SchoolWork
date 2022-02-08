/*
In this program, please 
(1) Accept a string such as "StopAndSemllTheRose."
(2) Convert the sentence to a string in which the words are
    separated by spaces and only the first word starts with
    an uppercase letter
(3) display the string
(4) please name your java source file as homework9_1.java
For example:
Example 1:
input:StopAndSmellTheRose
output:Stop and smell the rose.
Example 2:
input:KnowledgeIsPower.
output:Knowledge is power.
*/
import java.util.Scanner;

public class homework9_1
{
	public static void main(String[] args)
	{
	   StringBuilder txet = new StringBuilder();
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("enter a string with no spaces, but demarkes where they should be with capital letters:");
	   String text = sc.next();		sc.close();
	   txet.append(text.charAt(0));
	   for(int a = 1 ; a < text.length(); a++)
	   {
		   char current = text.charAt(a);
		   if(Character.isUpperCase(current))
		   {  txet.append(" "+Character.toLowerCase(current));   }
		   else txet.append(current);
	   }
	   System.out.println(txet);
	}
}