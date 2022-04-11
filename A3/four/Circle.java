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
	protected DrawingPanel panel = null;
	protected Color c = Color.BLUE;
	protected int x = 20;
	protected int y = 70;
	protected int width = 50;
	protected int height = 50;
	
	public Circle(DrawingPanel panel) 	{	this.panel = panel;	}
	
	public void draw(Visitor v) {	v.draw(this);	}
}