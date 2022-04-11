public class SubjectForOnlyNewState extends Subject
{
	public void setState(int state) {	if(state!=subjectState) {	super.setState(state);  }	}
}
