public class Main 
{
	public static void main(String[] args) 
	{
		Subject subject = new SubjectForOnlyNewState();
		
		Observer x = new Observer(subject);
		Observer y = new Observer(subject);
		Observer z = new Observer(subject);
		
		x.setState(10);
		y.setState(10);		
		
		subject.detach(y);
		
		z.setState(12);	
	}
}
