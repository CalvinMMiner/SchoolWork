import java.io.File;
import java.lang.reflect.Method;

public class Test 
{
	public double d;
	public Test(double d) {		this.d = d;		}
	
	public void x1(int i) {}
	public void  y(String s) {}
	public void x2(File f) {}
	
	public  void m()
	{
		try
		{
			Class<?> c = Class.forName("Test");
			Method[] m = c.getDeclaredMethods();
			for (int i = 0; i < m.length; i++)
				System.out.println( m[i].toString( ) );
		}catch(Exception e) {}
	}
}
