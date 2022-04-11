import java.awt.Graphics;

/**
 * CSC 402-01 Assignment #3
 * 
 * On my honor, Calvin M Miner, this assignment is my own work.  
 * I, Calvin M Miner, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */

public class Visitor 
{
	private static Visitor instance = null;
	private Visitor() {}
	
	public static Visitor getinstance()
	{
		if(instance==null)
			instance = new Visitor();
		return instance;
	}
	
	public void visit(Line l) 
	{
		Graphics g = l.panel.getGraphics();
		g.setColor(l.c);
		g.drawLine(l.x1, l.y1, l.x2, l.y2);
	}
	
	public void visit(Circle c) 
	{
		Graphics g = c.panel.getGraphics();
		g.setColor(c.c);
		g.fillOval(c.x, c.y, c.width, c.height);
	}
	
	public void visit(Square s) 
	{
		Graphics g = s.panel.getGraphics();
		g.setColor(s.c);
		g.fillRect(s.x, s.y, s.width, s.height);
	}
	
}
