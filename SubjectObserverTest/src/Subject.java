import java.util.ArrayList;
import java.util.List;

public class Subject 
{
	private List<Observer> observerList = new ArrayList<Observer>();
	protected int subjectState;

	public void attach(Observer observer) 
	{
		if(!observerList.contains(observer))
			observerList.add(observer);
	}
	
	public void detach(Observer observer) 	{	observerList.remove(observer);	}

	public void setState(int state) 
	{
		subjectState = state;
		notifyAllObservers() ;
	}
	
	private void notifyAllObservers() 
	{
		for (Observer o : observerList) 
			o.update(subjectState);
	}

}
