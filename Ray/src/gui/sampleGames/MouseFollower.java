package gui.sampleGames;

import gui.GUIApplication;
import gui.screens.ClickScreen;
import gui.screens.CoordinateScreen;
import gui.screens.ScreenThing;

public class MouseFollower extends GUIApplication {
	private static final long serialVersionUID = 3942658605762321424L;
	private CoordinateScreen cs;
	public static MouseFollower game;
	public static ScreenThing myScreen;
	public static ClickScreen screen2;
	public MouseFollower(int width, int height) {
		super(width, height);
		
	}
	@Override
	public void initScreen() {
		cs = new CoordinateScreen(getWidth(), getHeight());
		myScreen = new ScreenThing(getWidth(), getHeight());
		screen2 = new ClickScreen(getWidth(), getHeight());
		setScreen(cs);
	}
	public static void main(String[] args) {
		game = new MouseFollower(1000, 750);
		Thread app = new Thread(game);
		app.start();
	}
}
