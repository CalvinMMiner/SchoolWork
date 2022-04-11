public class HexaObserver extends Observer
{
	public HexaObserver(Subject subject)	{	super(subject);	}
	
	public void update	(int state)	{	System.out.println(this.toString() + " new state: " + Integer.toHexString(state));	}
}
