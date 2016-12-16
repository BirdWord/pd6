package gui.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.TextArea;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{
	private TextLabel text;
	public CoordinateScreen(int width, int height) {
		super(width, height);
		
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		text = new TextLabel(20, 200, 500, 40, "Some text");
		viewObjects.add(text);
		Button button = new Button(100, 140, 150, 40, "Click me", new Color(0,76,153), new Action(){
			public void act(){
				
			}});
		viewObjects.add(button);
		TextArea moreText = new TextArea(200, 50, 200, 80, "There is so much text here and stuff");
		viewObjects.add(moreText);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		text.setText("Mouse at ("+mx+", "+my+")");
	}
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}

}
