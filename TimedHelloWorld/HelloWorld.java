import java.util.Scanner;

public class HelloWorld
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String hello = new String(); 
		
		System.out.println("your job is to type the sentence \"Hello World!\" as fast as you can. When you are ready"
		+ ", press enter, type the sentence, and press enter again.");
		sc.nextLine();
		
		long start = System.nanoTime();
		hello = sc.nextLine();
		long finish = System.nanoTime();

		if(hello.equals("Hello World!"))
		{			
			System.out.println("congratulations, you typed that in: "+(finish - start)/1000000 +" milliseconds");
		}
		else
		{
			System.out.println("I am sorry, we where looking for the sentence \"Hello World!\" not: " + hello +" do keep in mind it is case sensitive");
		}
		
		sc.close();
	}
}
