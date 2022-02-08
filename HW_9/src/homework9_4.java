/*
Reverse a string.
The input string is given as an array of caracters char[]. 
Do not allocate extra space for another array, you must do
this by modifying the input array in-place with O(1) extra memory.
Example 1:
input:['h','e','l','l','o']
output: ['o','l','l','e','h']
Example 2:
input: ['H','a','n','n','a','h']
output: ['h','a','n','n','a','H']
Please finish the following program to fullfil the function.
*/
public class homework9_4
{
   public static void main(String[] args)
   {
      reverseString(new char[]{'h','e','l','l','o'});
      reverseString(new char[]{'H','a','n','n','a','h'});
   }
   public static void reverseString(char[] s)
   {
	   int i; char a;
	   for( i = 0; i < (s.length)/2; i++ )
	   {
		   a = s[i];
		   s[i] = s[s.length - i - 1];
           s[s.length - i - 1] = a;
	   }
      
      //print out all of the elements
      for(i = 0; i<s.length;i++)
         System.out.print(s[i]);
      System.out.println();
   }
}