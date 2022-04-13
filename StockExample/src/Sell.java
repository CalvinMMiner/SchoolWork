public class Sell implements Order
{
	private String name;
	private int amount;
	private Broker broker;
	
	public Sell(String s, int i, Broker b) 
	{
		name = s;
		amount = i;
		broker = b;
	}

	public void undo()	  {	broker.buy(name, amount);	}
	
	public void execute() {	broker.sell(name, amount);	}

}
