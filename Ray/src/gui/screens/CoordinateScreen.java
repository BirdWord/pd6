package gui.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.Graphic;
import gui.components.TextArea;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.sampleGames.MouseFollower;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener {
	private TextLabel text;
	private Button button;
	private TextArea area;
	private Graphic potato;
	private Graphic smalltato;
	private Graphic scaletato;
	public CoordinateScreen(int width, int height) {
		super(width, height);
		
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		text = new TextLabel(20, 200, 500, 40, "Mouse not on screen");
		viewObjects.add(text);
		button = new Button(100, 140, 150, 40, "Click me", new Color(0,76,153), new Action(){
			public void act(){MouseFollower.game.setScreen(MouseFollower.screen2);}});
		viewObjects.add(button);
		area = new TextArea(200, 50, 200, 80, "There is so much text here and stuff.");
		viewObjects.add(area);
		potato = new Graphic(300, 100, "resources/sampleImages/potato.png");
		viewObjects.add(potato);
		smalltato = new Graphic(650, 225, 100, 100, "resources/sampleImages/potato.png");
		viewObjects.add(smalltato);
		scaletato = new Graphic(800, 400, .1, "resources/sampleImages/potato.png");
		viewObjects.add(scaletato);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		text.setText("Mouse at ("+e.getX()+", "+e.getY()+")");
	}
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
	
	public MouseListener getMouseListener(){
		return this;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(button.isHovered(e.getX(), e.getY())){
			button.act();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
