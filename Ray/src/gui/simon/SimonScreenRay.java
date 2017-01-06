package gui.simon;

import java.util.ArrayList;
import java.util.List;

import gui.components.Visible;
import gui.screens.ClickableScreen;

public class SimonScreenRay extends ClickableScreen implements Runnable {
	private ProgressInterfaceRay progress;
	private ArrayList<MoveInterfaceRay> moves;
	private int roundNum;
	private boolean canClick;
	
	private final int START_MOVES = 3;
	public SimonScreenRay(int width, int height) {
		super(width, height);
	}

	@Override
	public void run() {
		
	}
	private ProgressInterfaceRay getProgress(){
		return null;
	}
	private MoveInterfaceRay getAMove(){
		return null;
	}
	@Override
	public void initAllObjects(List<Visible> list) {
		progress = getProgress();
		moves = new ArrayList<MoveInterfaceRay>();
		for(int i = 0; i<START_MOVES; i++){
			getAMove();
		}
		moves.add(getAMove());
		roundNum = 1;
	}

}
