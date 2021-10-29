package a3; import java.util.*;

public class CatsAndDogs 
{
	public static void main(String[] args) 
	{
		ArrayList<Cat> cats = new ArrayList<Cat>();
		for (int i = 0; i < 7; i++) 
			cats.add(new Cat(i));// here’s trouble
			//cats.add(new Dog(8));
			for(int i = 0; i < cats.size(); i++)  
				(  cats.get(i) ).print();
	}
}
