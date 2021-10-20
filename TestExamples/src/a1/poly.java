package a1;

public class poly
{
	public static void main(String [] args)
	{
		F[] pity = { new BZ(), new BA(), new M(), new F() };
		for (int i = 0; i < pity.length; i++) 
		{
			System.out.println(pity[i]);    
			pity[i].method1();
			pity[i].method2();
			System.out.println("--"); 
		}
	}
}

