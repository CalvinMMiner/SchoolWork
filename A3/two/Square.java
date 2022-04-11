/**
 * CSC 402-01 Assignment #3
 * 
 * On my honor, Calvin M Miner, this assignment is my own work.  
 * I, Calvin M Miner, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */

import java.awt.Graphics;
import java.awt.Color;

public class Square implements Shape {
	private DrawingPanel panel = null;
	private Color c = Color.RED;
	private int x = 20;
	private int y = 10;
	private int width = 100;
	private int height = 50;
	
	public Square(DrawingPanel panel) {
		this.panel = panel;
	}
	
	public void draw() {
		Graphics g = panel.getGraphics();
		g.setColor(c);
		g.fillRect(x, y, width, height);
	}
}
