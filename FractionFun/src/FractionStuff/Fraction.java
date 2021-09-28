package FractionStuff;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Fraction 
{
	int numerator;
	int denominator;
	
	Fraction() 
	{
		numerator = denominator = 1;  
		// add code here
	}
	
	Fraction(int n, int d) 
	{
		numerator = (n/gcd(n, d));
		denominator=(d/gcd(n, d));
		
	}
	
	private int gcd(int a, int b) 
	{
		if (b == 0)	return (a);
		else return (gcd(b, a % b));
	}
	
	public String toString() 
	{    
		return numerator+"/"+denominator;
	}
	
	String toDecimal() 
	{
		DecimalFormat numberFormat = new DecimalFormat("#.0000000");
		numberFormat.setRoundingMode(RoundingMode.CEILING);
		
		return numberFormat.format((double)numerator/denominator);
	}

	private int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }
	
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
			
			Fraction f1 = new Fraction(	f.numerator, f.denominator);
			return f1;
		}
	}
}
 
