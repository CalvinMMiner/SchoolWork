package GenericClass;

public class Triangle<T, S> implements Comparable<Triangle<T,S>>
{
	private T length;
	private S height;
	
	public void Triangle() {}
	public void Triangle(T L, S H) {setLength(L); setHeight(H); }
	
	public T getLength() { return length; }
	public S getHeight() { return height; }
	
	public void setLength(T L) { length = L; }
	public void setHeight(S H) { height = H; }
	
	public String toString() { return "the Triangle has a length of " + getLength() + " and a height of " + getHeight(); }

	public int compareTo(Triangle b) {return 0;}
}
