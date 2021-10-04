package FractionStuff;

import java.math.RoundingMode;
import java.text.DecimalFormat;

//this class takes in two ints and uses them to create a fraction
public class Fraction 
{
	int numerator;
	int denominator;
	
	//default constructor 
	Fraction() 
	{
		numerator = denominator = 1;  
	}
	
	//accepts two ints and uses them to set numerator and denominator after ruining them through gcd
	Fraction(int n, int d) 
	{
		numerator = (n/gcd(n, d));
		denominator=(d/gcd(n, d));
		
	}
	
	//this method takes in two ints and finds then returns their Greatest common divisor 
	private int gcd(int a, int b) 
	{
		if (b == 0)	return (a);
		else return (gcd(b, a % b));
	}
	
	//returns the numerator and denominator formated to look like a fraction
	public String toString() 
	{    
		return numerator+"/"+denominator;
	}
	
	//takes the numerator and denominator and divides them, uses DecimalFormat to restrict the decimal to 8 places rounds up
	String toDecimal() 
	{
		DecimalFormat numberFormat = new DecimalFormat("#.00000000");
		numberFormat.setRoundingMode(RoundingMode.CEILING);
		
		return numberFormat.format((double)numerator/denominator);
	}

	//this method takes in two ints and uses gcd and some math to find and return their Least common multiple
	private int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }
	
	//this method takes in a different fraction and uses lcm and a array of if else statements to add the two sets of numerator and denominator then returns the altered Fraction
	Fraction add(Fraction f) 
	{
		if( denominator == f.denominator)
		{
			f.numerator += numerator;
			return f;
		}
		
		int LCM = lcm(denominator, f.denominator);
		
		if (f.denominator == LCM)
		{
			f.numerator += numerator*LCM;
			return f;
		}
		
		else if (denominator == LCM)
		{
			f.numerator = f.numerator*LCM+numerator;
			return f;
		}
		
		else 
		{
			f.numerator = numerator*LCM+f.numerator*LCM;
			f.denominator =denominator*LCM;

			return f;
		}
	}
}
 
