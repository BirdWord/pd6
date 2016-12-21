package gui.sampleGames;

import gui.GUIApplication;
import gui.screens.CoordinateScreen;

public class MouseFollower extends GUIApplication {
	private CoordinateScreen cs;
	public static MouseFollower game;
	public static ScreenThing myScreen;
	public MouseFollower(int width, int height) {
		super(width, height);
		
	}
	@Override
	public void initScreen() {
		cs = new CoordinateScreen(getWidth(), getHeight());
		myScreen = new ScreenThing(getWidth(), getHeight());
		setScreen(cs);
	}
	public static void main(String[] args) {
		game = new MouseFollower(1000, 750);
		Thread app = new Thread(game);
		app.start();
	}

}
