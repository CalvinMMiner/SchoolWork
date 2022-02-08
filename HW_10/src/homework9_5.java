/*
Remove duplicate letters in a string.
Givin a string S of lowercase letters, a duplicate removal 
consists of choosing two adjacent and equal letters, and removing them.
We repeatedly make duplicate removals on S until we no longer can.
Return the final string after all such duplicate removals have been made.
Example 1
input: "xyyxzx"
output: "zx"
Exaplanation: In "xyyxzx", the first round removeal is "yy".
After "yy" has been removed, the string is "xxzx". Then, in the next round,
"xx" will be removed. "zx" is the final result.
Please name your java file as homework9_5.java
*/
import java.util.Scanner;
public class homework9_5
{
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   
		System.out.println("enter a string of lowercase letters:");
		StringBuilder text = new StringBuilder(sc.nextLine());		sc.close();

		do {
			int z = 0;
			for( int i = 0; i < text.length()-1; i++ )
			{
				if(text.charAt(i) == text.charAt(i+1)) 
					z++; text.delete(i, i+2);
			}
			if(z==0)
				break;
		}while(true);
		System.out.println(text);
   }
}