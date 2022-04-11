/**
 * CSC 402-01 Assignment #3
 * 
 * On my honor, Calvin M Miner, this assignment is my own work.  
 * I, Calvin M Miner, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */
import java.awt.Color;
import java.awt.Graphics;

public class Circle implements Shape 
{	
	private DrawingPanel panel = null;
	private Color c = Color.BLUE;
	private int x = 20;
	private int y = 70;
	private int width = 50;
	private int height = 50;
	
	public Circle(DrawingPanel panel) 	{	this.panel = panel;	}
	
	public void draw(Visitor v) 
	{
		Graphics g = panel.getGraphics();
		g.setColor(c);
		g.fillOval(x, y, width, height);
	}
}