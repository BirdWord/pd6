package gui.whackAMole;

import java.util.ArrayList;
import java.util.List;

import gui.components.Action;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;

public class WhackAMoleScreen extends ClickableScreen implements Runnable{
	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;
	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 30;
		Thread play = new Thread(this);
		play.run();
	}

	private PlayerInterface getAPlayer(){
		return null;
	}
	private MoleInterface getAMole(){
		return null;
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(350, 220, 100, 40, "Sample Text");
		timeLabel = new TextLabel(360, 40, 80, 40, "30.0");
		//viewObjects.add(player);
		viewObjects.add(timeLabel);
		viewObjects.add(label);
	}

	public void run(){
		changeText("Ready...");
		changeText("Set...");
		changeText("GO");
		label.setText("");
		while(timeLeft > 0){
			updateTimer();
			updateAllMoles();
			appearNewMole();
		}
	}

	private void appearNewMole() {
		double chance = .1*(60-timeLeft)/60;
		if(Math.random() < chance){
			final MoleInterface mole = getAMole();
			mole.setAppearanceTime((int)(500+Math.random()*2000));
			mole.setAction(new Action(){
				public void act(){
					player.increaseScore(1);
					remove(mole);
					moles.remove(mole);
				}
			});
			addObject(mole);
			moles.add(mole);
		}
	}

	private void updateAllMoles() {
		for(int i = 0; i<moles.size(); i++){
			MoleInterface m = moles.get(i);
			int screenTime = m.getAppearanceTime()-100;
			m.setAppearanceTime(screenTime);
			if(m.getAppearanceTime() <= 0){
				remove(m);
				moles.remove(m);
				i--;
			}
		}
	}

	private void updateTimer() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		timeLeft-=.1;
		timeLabel.setText(""+((int)(timeLeft*10)/10.0));
	}

	private void changeText(String string) {
		label.setText(string);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
