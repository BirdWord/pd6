package gui.whackAMole;

import gui.GUIApplication;

public class WhackAMoleGame extends GUIApplication{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public WhackAMoleGame(int width, int height) {
		super(width, height);
	}

	@Override
	public void initScreen() {
		WhackAMoleScreen wams = new WhackAMoleScreen(getWidth(), getHeight());
		setScreen(wams);
	}
	public static void main(String[] args){
		WhackAMoleGame wamg = new WhackAMoleGame(800,500);
		Thread game = new Thread(wamg);
		game.start();
	}
	
}
