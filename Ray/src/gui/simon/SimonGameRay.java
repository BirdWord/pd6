package gui.simon;

import gui.GUIApplication;

public class SimonGameRay extends GUIApplication {
	public SimonGameRay(int width, int height) {
		super(width, height);
	}

	@Override
	public void initScreen() {
		SimonScreenRay simonScreen = new SimonScreenRay(getWidth(), getHeight());
		setScreen(simonScreen);
	}

	public static void main(String[] args) {
		SimonGameRay game = new SimonGameRay(500,500);
		Thread thread = new Thread(game);
		thread.start();
	}

}
