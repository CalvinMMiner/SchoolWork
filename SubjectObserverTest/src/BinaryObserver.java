public class BinaryObserver extends Observer
{
	public BinaryObserver(Subject subject)	{	super(subject);	}
	
	public void update	(int state)	{	System.out.println(this.toString() + " new state: " + Integer.toBinaryString(state));	}
}
