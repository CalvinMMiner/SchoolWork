public class Buy implements Order
{
	private String name;
	private int amount;
	private Broker broker;
	
	public Buy(String s, int i, Broker b) 
	{
		name = s;
		amount = i;
		broker = b;
	}
	
	public void undo()    {	broker.sell(name, amount);	}

	public void execute() {	broker.buy(name, amount);	}

}
