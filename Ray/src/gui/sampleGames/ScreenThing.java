package gui.sampleGames;

import java.util.ArrayList;
import java.util.Arrays;

import gui.Screen;
import gui.components.TextLabel;
import gui.components.Visible;

public class ScreenThing extends Screen{
	private TextLabel text;
	public ScreenThing(int w,int h) {
		super(w,h);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		text = new TextLabel(20, 200, 500, 40, "HERE IS SOME TEXT");
		viewObjects.add(text);
		System.out.println(viewObjects);
	}

}
