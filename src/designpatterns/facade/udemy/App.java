package designpatterns.facade.udemy;
public class App {
	public static void main(String[] args) {
		
		Game game = new Game();
		
		// Game loop
		while(true) {
			game.update();
		}
	}
}

// www.caveofprogramming.com


