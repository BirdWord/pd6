package simon;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;

public class SimonScreenRay extends ClickableScreen implements Runnable {
	private ProgressInterfaceRay progress;
	private ArrayList<MoveInterfaceRay> sequence;
	private int round;
	private boolean acceptInput;
	private final int BUTTONS = 5;
	private TextLabel label;
	private ButtonInterfaceRay[] buttons;
	private int sequenceIndex;
	private int lastSelectedButton;
	public SimonScreenRay(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		acceptInput = false;
		progress.increaseRound(1);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		generateButtons();
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		sequence = new ArrayList<MoveInterfaceRay>();
		lastSelectedButton = -1;
		sequence.add(randomMove());
		sequence.add(randomMove());
		round = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
	}

	private MoveInterfaceRay randomMove() {
		ButtonInterfaceRay b;
		int rand = (int)(Math.random()*buttons.length);
		while(rand == lastSelectedButton){
			rand = (int)(Math.random()*buttons.length);
		}
		b = buttons[rand];
		return getMove(b);
	}

	private MoveInterfaceRay getMove(ButtonInterfaceRay b) {
		return null;
	}

	private void generateButtons() {
		Color[] colors = new Color[BUTTONS];
		for(int i = 0; i<colors.length; i++){
			colors[i] = new Color(randomRGB(),randomRGB(),randomRGB());
		}
	}

	private ButtonInterfaceRay getAButton() {
		return null;
	}

	private ProgressInterfaceRay getProgress() {
		// TODO Auto-generated method stub
		return null;
	}
	private int randomRGB(){
		return (int)(Math.random()*256);
	}
}
