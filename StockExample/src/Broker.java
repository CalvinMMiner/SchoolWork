import java.util.ArrayList;
import java.util.List;

public class Broker 
{
	private String name;
	private List<Order> orderList = new ArrayList<Order>();
	public Broker(String s){	name = s;	}

	public void buy(String symbol, int quantity) 
	{	System.out.println("Stock [ Name: " + symbol + ", Quantity: " + quantity + " ] bought from " + name);	}

	public void sell(String symbol, int quantity) 
	{	System.out.println("Stock [ Name: " + symbol + ", Quantity: " + quantity + " ] sold to "     + name);	}

	public void takeOrder(Order order) {	orderList.add(order);	}

	public void placeorders() 
	{
		for(Order o: orderList)
			o.execute();
		
		orderList.clear(); 
	}
		
	
}
