package gui.screens;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Action;
import gui.components.ClickableGraphic;
import gui.components.Visible;
import gui.sampleGames.MouseFollower;

public class ClickScreen extends Screen implements MouseListener{
	private ClickableGraphic c;
	public ClickScreen(int w, int h) {
		super(w,h);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		c = new ClickableGraphic(300, 200, "resources/sampleImages/potato.png");
		c.setAction(new Action(){public void act(){MouseFollower.game.setScreen(MouseFollower.myScreen);}});
		viewObjects.add(c);
	}
	public MouseListener getMouseListener(){
		return this;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(c.isHovered(e.getX(), e.getY())){
			c.act();
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
