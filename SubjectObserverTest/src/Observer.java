public class Observer
{
	private Subject observerSubject;
	
	public Observer(Subject subject)
	{
		observerSubject = subject;
		observerSubject.attach(this);
	}
	
	public void update	(int state)	{	System.out.println(this.toString() + " new state: " + state);	}
	
	public void setState(int state)	{	observerSubject.setState(state);	}
}
