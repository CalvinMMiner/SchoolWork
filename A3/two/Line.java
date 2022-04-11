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

public class Line implements Shape {
	private DrawingPanel panel = null;
	private Color c = Color.GREEN;
	private int x1 = 50;
	private int y1 = 150;
	private int x2 = 200;
	private int y2 = 50;
	
	public Line(DrawingPanel panel) {
		this.panel = panel;
	}
	
	public void draw() {
		Graphics g = panel.getGraphics();
		g.setColor(c);
		g.drawLine(x1, y1, x2, y2);
	}
}
