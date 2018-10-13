package w5d1;
import apcs.Window;


public class Game {

	public static void main(String[] args) {
		
		Ball ball1 = new Ball(15, 3);
		Ball ball2 = new Ball(7, -7);
		Ball ball3 = new Ball(-6, 10);
		
		
		while(true) {
			Window.frame();
			Window.out.background("white");
			
			ball1.draw();
			ball2.draw();
			ball3.draw();
			
			
			ball1.move();
			ball2.move();
			ball3.move();
			
		}

	}

}
