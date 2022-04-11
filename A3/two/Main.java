/**
 * CSC 402-01 Assignment #3
 * 
 * On my honor, Calvin M Miner, this assignment is my own work.  
 * I, Calvin M Miner, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(300, 200);

		ArrayList<Shape> list = new ArrayList<Shape>();
		list.add(new Circle(panel));
		list.add(new Line(panel));
		list.add(new Square(panel));
		
		for(Shape g : list) {
			g.draw();
		}		
	}
}
