package gui.screens;

import java.awt.event.MouseListener;
import java.util.List;

import gui.components.Action;
import gui.components.ClickableGraphic;
import gui.components.Visible;
import gui.sampleGames.MouseFollower;

public class MyPracticeClickableScreen extends ClickableScreen implements MouseListener{
	private ClickableGraphic c;
	public MyPracticeClickableScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> list) {
		c = new ClickableGraphic(300, 200, "resources/sampleImages/potato.png");
		c.setAction(new Action(){public void act(){MouseFollower.game.setScreen(MouseFollower.myScreen);}});
		addObject(c);
	}

}
