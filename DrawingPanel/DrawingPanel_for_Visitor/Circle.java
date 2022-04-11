//package beforevisitor;

import java.awt.Color;
import java.awt.Graphics;

public class Circle implements Shape {	
	DrawingPanel panel = null;
	Color c = Color.BLUE;
	int x = 20;
	int y = 70;
	int width = 50;
	int height = 50;
	
	public Circle(DrawingPanel panel) {
		this.panel = panel;
	}
	
	public void draw() {
		Graphics g = panel.getGraphics();
		g.setColor(c);
		g.fillOval(x, y, width, height);
	}
}
