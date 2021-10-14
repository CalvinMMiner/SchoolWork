package a1;

public class test_1 
{
	public static void main(String[] args) 
	{
		String s1 = "java";
		String s2 = "CC_2S40";
		
		System.out.println(s1.compareTo(s2));//Compares the difference between the first different letters of each string

		if (s1.compareTo(s2)==0) System.out.println("same");
		else System.out.println((s1.compareTo(s2)<0) ? "s1 is the larger string" : "s2 is the larger string");
	}
}
