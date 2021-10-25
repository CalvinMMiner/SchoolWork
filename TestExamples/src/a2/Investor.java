package a2;

public class Investor 
{
	Stock[] portfolio;
	Advisor ohTrustedOne;
	double value;
	
	Investor() {	portfolio = new Stock[0];	}
	Investor(Stock[] p, Advisor a)
	{
		portfolio = p;
		ohTrustedOne = a;
		value = ohTrustedOne.findValue(p);
	}
	
	String describePortfolio() 
	{
		String s = new String();
		s += "My portfolio is: \n";
		for (int i = 0; i < portfolio.length; i++)	s += portfolio[i] + "\n";s += "The total value is $" + value;
		return s;
	}
	
	void askAdvice() {ohTrustedOne.advise(portfolio);}
}
