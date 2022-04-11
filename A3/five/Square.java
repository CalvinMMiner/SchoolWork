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

public class Square implements Shape 
{
	protected DrawingPanel panel = null;
	protected Color c = Color.RED;
	protected int x = 20;
	protected int y = 10;
	protected int width = 100;
	protected int height = 50;
	
	public Square(DrawingPanel panel) {	this.panel = panel;	}
	
	public void accept(Visitor v) {	v.visit(this);	}
}
