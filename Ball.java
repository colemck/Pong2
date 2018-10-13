package w5d1;

import apcs.Window;



public class Ball {
	
	
	
	//attributes
	int x = 0;
	int y = 0;
	int dx = Window.random(-10,  10);
	int dy = Window.random(-10,  10);
	int radius = 20;
	String color = "";
	
	//constructor
	public Ball(String color) {
		this.color = color;
	}

	
	public void draw() {
		Window.out.randomColor();
		Window.out.circle(x, y, radius);
		this.move();
	}
	
	private void move(){
		x = x + dx;
		y = y + dy;
		
	}
	
	// minimized
	public void reflect() {
		if(x < radius || x > Window.width() - radius){
			dx = -dx;
		}
		if(y < radius || y > Window.height() - radius){
			dy = -dy;
		}
	}
	
}
